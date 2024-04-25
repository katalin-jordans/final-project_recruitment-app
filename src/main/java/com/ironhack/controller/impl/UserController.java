package com.ironhack.controller.impl;

import com.ironhack.model.User;
import com.ironhack.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<User> getAll() {
        return repository.findAll();
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public List<User> addUser() {
        return repository.findAll();
    }
}
