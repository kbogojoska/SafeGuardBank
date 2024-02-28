package mk.ukim.finki.safeguardbank.repository;

import mk.ukim.finki.safeguardbank.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
//@Repository
public interface TransactionRepository extends JpaRepository<Long, Transaction> {
}
