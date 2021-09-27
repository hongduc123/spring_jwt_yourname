package com.example.spring_boot_jwt_yourname.service;

import com.example.spring_boot_jwt_yourname.authen.UserPrincipal;
import com.example.spring_boot_jwt_yourname.enity.User;
import com.example.spring_boot_jwt_yourname.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service

public class UserServicelmpl extends  UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public User createUser(User user){return userRepository.saveAndFlush(user);}

    @Override
    public UserPrincipal findByUsername(String username){
        User user= userRepository.findByUsername(username);
        UserPrincipal userPrincipal = new UserPrincipal();

        if (null != user){
            Set<String > authorrities = new HashSet<>();
            if (null != user.getRoles())
                user.getRoles().forEach(r -> {
                    authorrities.add(r.getRoleKey());
                    r.getPermissions().forEach(
                            p -> authorrities.add(p.getPermissionKey()))
                });
                userPrincipal.setUserId(user.getId());
                userPrincipal.setUsername(user.getUsername());
                userPrincipal.setPassword(user.getPassword());
                userPrincipal.setAuthorities(authorrities);

}
        return  userPrincipal;
    }
