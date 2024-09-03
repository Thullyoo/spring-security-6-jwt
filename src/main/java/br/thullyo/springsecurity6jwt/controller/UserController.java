package br.thullyo.springsecurity6jwt.controller;

import br.thullyo.springsecurity6jwt.dto.UserRequest;
import br.thullyo.springsecurity6jwt.entity.User;
import br.thullyo.springsecurity6jwt.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public User registerUser(@RequestBody UserRequest user){
        return this.userService.registerUser(user);
    }
}
