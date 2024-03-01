package mk.ukim.finki.safeguardbank.service.impl;

import mk.ukim.finki.safeguardbank.model.*;
import mk.ukim.finki.safeguardbank.repository.TransactionRepository;
import mk.ukim.finki.safeguardbank.service.TransactionService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {
    private final TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public List<Transaction> listAll() {
        return transactionRepository.findAll();
    }

    @Override
    public List<Transaction> listAllByUser(User client) {
        checkIfUserIsClient(client);
        return transactionRepository.findAllByClient_Id(client.getId());
    }

    @Override
    public List<Transaction> listAllByUserTypeDeposit(User client) {
        checkIfUserIsClient(client);
        return transactionRepository.findAllByClient_IdAndTransactionType(client.getId(), TYPE.DEPOSIT);
    }

    @Override
    public List<Transaction> listAllByUserTypeWithdraw(User client) {
        checkIfUserIsClient(client);
        return transactionRepository.findAllByClient_IdAndTransactionType(client.getId(), TYPE.WITHDRAW);
    }

    @Override
    public Integer countWithdrawalByUser(User client) {
        checkIfUserIsClient(client);
        return transactionRepository.countAllByClient_IdAndTransactionTypeEquals(client.getId(), TYPE.WITHDRAW);
    }

    @Override
    public Integer countDepositbyUser(User client) {
        checkIfUserIsClient(client);
        return transactionRepository.countAllByClient_IdAndTransactionTypeEquals(client.getId(), TYPE.DEPOSIT);
    }

    @Override
    public Double getDepositSumByUser(User client) {
        List<Transaction> deposits = listAllByUserTypeDeposit(client);
        return deposits.stream().mapToDouble(Transaction::getSum).sum();
    }

    @Override
    public Double getWithdrawSumByUser(User client) {
        List<Transaction> withdrawals = listAllByUserTypeWithdraw(client);
        return withdrawals.stream().mapToDouble(Transaction::getSum).sum();
    }

    @Override
    public List<Transaction> listAllByDate(LocalDateTime dateTime) {
        return transactionRepository.findAllByDateOfTransaction(dateTime);
    }

    @Override
    public List<Transaction> listAllByDateByUser(LocalDateTime dateTime, User client) {
        checkIfUserIsClient(client);
        return transactionRepository.findAllByClient_IdAndDateOfTransaction(client.getId(), dateTime);
    }

    @Override
    public List<Transaction> listAllByDateBetween(LocalDateTime after, LocalDateTime before) {
        return transactionRepository.findAllByDateOfTransactionBetween(after, before);
    }

    @Override
    public List<Transaction> listAllByDateBetweenByUser(LocalDateTime after, LocalDateTime before, User client) {
        checkIfUserIsClient(client);
        return transactionRepository.findAllByClient_IdAndDateOfTransactionBetween(client.getId(), after, before);
    }

    private void checkIfUserIsClient(User client) {
        if (!(client.getRole().equals(ROLE.CLIENT) || client.getRole().equals(ROLE.PREMIUM_CLIENT)))
            throw new RuntimeException();
    }
}
