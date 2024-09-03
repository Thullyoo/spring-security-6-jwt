package br.thullyo.springsecurity6jwt.services;

import br.thullyo.springsecurity6jwt.dto.UserRequest;
import br.thullyo.springsecurity6jwt.entity.User;
import br.thullyo.springsecurity6jwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    private final UserRepository userRepository;


    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User registerUser(UserRequest user){
        return this.userRepository.save(new User(user.username(), passwordEncoder.encode(user.password())));
    }

}
