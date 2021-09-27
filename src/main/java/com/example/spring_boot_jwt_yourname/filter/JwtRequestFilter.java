package com.example.spring_boot_jwt_yourname.filter;

import com.example.spring_boot_jwt_yourname.authen.UserPrincipal;
import com.example.spring_boot_jwt_yourname.util.JwtUtil;
import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.token.Token;
import org.springframework.security.core.token.TokenService;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtRequestFilter extends OncePerRequestFilter{
    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private TokenService verificationTokenService;

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain)
        throws ServletException, IOException{
        final String authorizationHeader=  request.getHeader("Authorization");
        UserPrincipal user = null;
        Token token = null;




    }



}