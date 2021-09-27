package com.example.spring_boot_jwt_yourname.repository;

import antlr.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository  extends JpaRepository<Token, Long> {
    Token findToken(String token);

}
