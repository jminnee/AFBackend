package com.actionfigures.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.actionfigures.model.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
}
