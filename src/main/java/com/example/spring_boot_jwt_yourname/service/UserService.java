package com.example.spring_boot_jwt_yourname.service;

import com.example.spring_boot_jwt_yourname.authen.UserPrincipal;
import com.example.spring_boot_jwt_yourname.enity.User;

public  interface UserService {
  User createUser(User user);

  default UserPrincipal findByUsername(String username) {

  }
}