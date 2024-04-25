package com.ironhack.controller.interfaces;

import com.ironhack.model.User;

import java.util.List;

public interface UserControllerInterface {
    List<User> getUsers();
    User saveUser(User user);
}
