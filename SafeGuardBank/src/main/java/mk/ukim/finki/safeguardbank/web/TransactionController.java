package mk.ukim.finki.safeguardbank.web;

import mk.ukim.finki.safeguardbank.service.TransactionService;
import mk.ukim.finki.safeguardbank.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TransactionController {
    private final UserService userService;
    private final TransactionService transactionService;

    public TransactionController(UserService userService, TransactionService transactionService) {
        this.userService = userService;
        this.transactionService = transactionService;
    }

    @GetMapping
    public String homePage() {
        return "index";
    }
}
