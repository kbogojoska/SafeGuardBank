package mk.ukim.finki.safeguardbank.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue("2")
public class Client extends User{
    @OneToMany(mappedBy = "client")
    private List<Transaction> transactions;
    public Client(String username, String password, String name, String email, String address, String phoneNumber) {
        super(username, password, name, email, address, phoneNumber);
        this.setRole(ROLE.CLIENT);
        this.transactions = new ArrayList<>();
    }
}
