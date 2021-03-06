package com.example.security.repository;

import com.example.security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 程江涛 on 2019/4/13.
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
