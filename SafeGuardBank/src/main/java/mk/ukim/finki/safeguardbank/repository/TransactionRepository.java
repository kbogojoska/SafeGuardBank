package mk.ukim.finki.safeguardbank.repository;

import mk.ukim.finki.safeguardbank.model.TYPE;
import mk.ukim.finki.safeguardbank.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findAllByClient_Id(Long id);
    List<Transaction> findAllByClient_IdAndTransactionType(Long id, TYPE type);
    List<Transaction> findAllByDateOfTransactionBetween(LocalDateTime after, LocalDateTime before);
    List<Transaction> findAllByDateOfTransaction(LocalDateTime date);
    List<Transaction> findAllByClient_IdAndDateOfTransactionBetween(Long id, LocalDateTime after, LocalDateTime before);
    List<Transaction> findAllByClient_IdAndDateOfTransaction(Long id, LocalDateTime date);
    Integer countAllByClient_IdAndTransactionTypeEquals(Long id, TYPE type);
}
