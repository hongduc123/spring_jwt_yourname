package com.example.spring_boot_jwt_yourname.repository;

import com.example.spring_boot_jwt_yourname.enity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String usernam);

}
