package com.example.spring_boot_jwt_yourname.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.token.Token;
import org.springframework.stereotype.Service;

@Service
public  class TokenServicelmpl  implements  TokenService{
    @Autowired
    private TokenService tokenRepository;

    @Override
    public Token createToken(Token token) {
        return tokenRepository.saveAndFlush(token);
    }

    @Override
    public Token findByToken(String token){ return tokenRepository.findByToken();}
}