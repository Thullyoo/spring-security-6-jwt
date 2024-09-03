package br.thullyo.springsecurity6jwt.services;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public String authenticate(Authentication authentication){
        return "";
    }

}
