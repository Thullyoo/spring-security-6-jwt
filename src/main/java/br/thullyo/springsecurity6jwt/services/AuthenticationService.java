package br.thullyo.springsecurity6jwt.services;

import br.thullyo.springsecurity6jwt.security.JWTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    private JWTService jwtService;

    public String authenticate(Authentication authentication){
        return jwtService.generateToken(authentication);
    }

}
