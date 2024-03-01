package mk.ukim.finki.safeguardbank.repository;

import mk.ukim.finki.safeguardbank.model.ROLE;
import mk.ukim.finki.safeguardbank.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllByRole(ROLE role);
}
