package br.thullyo.springsecurity6jwt.services;

import br.thullyo.springsecurity6jwt.entity.User;
import br.thullyo.springsecurity6jwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    private final UserRepository userRepository;


    private final  BCryptPasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User registerUser(User user){
        return this.userRepository.save(new User(user.getName(), passwordEncoder.encode(user.getPassword())));
    }

}
