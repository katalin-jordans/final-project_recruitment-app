package com.ironhack.controller.impl;

import com.ironhack.model.Application;
import com.ironhack.model.Job;
import com.ironhack.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applications")
public class ApplicationController {

    @Autowired
    private ApplicationRepository applicationRepository;

    @GetMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public List<Application> getAll() {
        return applicationRepository.findAll();
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public List<Application> addApplication() {
        return applicationRepository.findAll();
    }
}
