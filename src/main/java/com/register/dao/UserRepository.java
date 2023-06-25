package com.register.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.register.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
