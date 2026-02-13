package com.example.dao;

import com.example.model.User;
import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User saveUser(User user);
    void deleteUser(Long id);
}