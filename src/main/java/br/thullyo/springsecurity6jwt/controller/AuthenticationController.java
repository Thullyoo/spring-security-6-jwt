package br.thullyo.springsecurity6jwt.controller;

import br.thullyo.springsecurity6jwt.services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("authentication")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping String authentication(Authentication authentication){
        return authenticationService.authenticate(authentication);
    }
}
