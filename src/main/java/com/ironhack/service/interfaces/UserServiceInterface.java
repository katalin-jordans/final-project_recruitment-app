package com.ironhack.service.interfaces;

import com.ironhack.model.Role;
import com.ironhack.model.User;

import java.util.List;
public interface UserServiceInterface {

    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    List<User> getUsers();
}
