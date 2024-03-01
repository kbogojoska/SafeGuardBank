package mk.ukim.finki.safeguardbank.service.impl;

import mk.ukim.finki.safeguardbank.model.ROLE;
import mk.ukim.finki.safeguardbank.model.User;
import mk.ukim.finki.safeguardbank.repository.UserRepository;
import mk.ukim.finki.safeguardbank.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> listAll() {
        return userRepository.findAll();
    }

    @Override
    public List<User> listPremium() {
        return userRepository.findAllByRole(ROLE.PREMIUM_CLIENT);
    }
}
