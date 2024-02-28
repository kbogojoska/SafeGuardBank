package mk.ukim.finki.safeguardbank.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    private Long id;
    private Client client;
    private Double sum;
    private LocalDateTime dateOfTransaction;
    private TYPE transactionType;
}
