package com.actionfigures.service;

import java.util.List;

import com.actionfigures.model.User;

public interface UserService {
    User getUserById(long id);
    List<User> getAllUsers();
}
