package mk.ukim.finki.safeguardbank.service;

import mk.ukim.finki.safeguardbank.model.Transaction;

import java.time.LocalDateTime;
import java.util.List;

public interface TransactionService {
    List<Transaction> listAll();
    List<Transaction> listAllByUser();
    List<Transaction> listAllByUserTypeDeposit();
    List<Transaction> listAllByUserTypeWithdraw();
    Integer countWithdrawal();
    Integer countDeposit();
    Integer getDepositSum();
    Integer getWithdrawSum();
    List<Transaction> listAllByDate(LocalDateTime dateTime);
    List<Transaction> listAllByDateBetween(LocalDateTime after, LocalDateTime before);
}
