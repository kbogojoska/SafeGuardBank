package mk.ukim.finki.safeguardbank.service.impl;

import mk.ukim.finki.safeguardbank.model.Transaction;
import mk.ukim.finki.safeguardbank.service.TransactionService;

import java.time.LocalDateTime;
import java.util.List;

//@Service
public class TransactionServiceImpl implements TransactionService {
    @Override
    public List<Transaction> listAll() {
        return null;
    }

    @Override
    public List<Transaction> listAllByUser() {
        return null;
    }

    @Override
    public List<Transaction> listAllByUserTypeDeposit() {
        return null;
    }

    @Override
    public List<Transaction> listAllByUserTypeWithdraw() {
        return null;
    }

    @Override
    public Integer countWithdrawal() {
        return null;
    }

    @Override
    public Integer countDeposit() {
        return null;
    }

    @Override
    public Integer getDepositSum() {
        return null;
    }

    @Override
    public Integer getWithdrawSum() {
        return null;
    }

    @Override
    public List<Transaction> listAllByDate(LocalDateTime dateTime) {
        return null;
    }

    @Override
    public List<Transaction> listAllByDateBetween(LocalDateTime after, LocalDateTime before) {
        return null;
    }
}
