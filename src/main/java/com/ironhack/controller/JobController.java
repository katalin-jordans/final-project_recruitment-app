package com.ironhack.controller;

import com.ironhack.model.Job;
import com.ironhack.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobRepository jobRepository;

    @GetMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public List<Job> getAll() {
        return jobRepository.findAll();
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public List<Job> addJob() {
        return jobRepository.findAll();
    }

}
