package mk.ukim.finki.safeguardbank.service;

import mk.ukim.finki.safeguardbank.model.User;

import java.util.List;

public interface UserService {
    List<User> listAll();
    List<User> listPremium();
}
