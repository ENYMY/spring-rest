package com.demo.springrest.service;

import com.demo.springrest.model.User;

import java.util.List;

public interface IUserService {
    User saveUser(User user);
    User getUserById(int id);
    List<User> getAllUsers();
}
