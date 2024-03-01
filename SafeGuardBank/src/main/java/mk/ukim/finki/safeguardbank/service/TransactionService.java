package mk.ukim.finki.safeguardbank.service;

import mk.ukim.finki.safeguardbank.model.Transaction;
import mk.ukim.finki.safeguardbank.model.User;

import java.time.LocalDateTime;
import java.util.List;

public interface TransactionService {
    List<Transaction> listAll();
    List<Transaction> listAllByUser(User user);
    List<Transaction> listAllByUserTypeDeposit(User client);
    List<Transaction> listAllByUserTypeWithdraw(User client);
    Integer countWithdrawalByUser(User client);
    Integer countDepositbyUser(User client);
    Double getDepositSumByUser(User client);
    Double getWithdrawSumByUser(User client);
    List<Transaction> listAllByDate(LocalDateTime dateTime);
    List<Transaction> listAllByDateByUser(LocalDateTime dateTime, User client);
    List<Transaction> listAllByDateBetween(LocalDateTime after, LocalDateTime before);
    List<Transaction> listAllByDateBetweenByUser(LocalDateTime after, LocalDateTime before, User client);
}
