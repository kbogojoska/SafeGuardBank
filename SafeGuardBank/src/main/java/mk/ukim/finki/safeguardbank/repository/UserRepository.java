package mk.ukim.finki.safeguardbank.repository;

import mk.ukim.finki.safeguardbank.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface UserRepository extends JpaRepository<Long, User> {
}
