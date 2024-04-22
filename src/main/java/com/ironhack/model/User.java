package com.ironhack.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

import static jakarta.persistence.FetchType.EAGER;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    @ManyToMany(fetch = EAGER)
    private Collection<Role> roles = new ArrayList<>();

    // Recruiter specific fields
    private int target;
    private int numberOfPlacements;
    @OneToMany(mappedBy="recruiter")
    private Set<Job> jobsByRecruiter;

    // Hiring Manager specific fields
    private String title;
    @OneToMany(mappedBy="hiringManager")
    private Set<Job> jobsByHiringManager;

    // Candidate specific fields
    private int numberOfApplications;
    private Date lastApplicationDate;
    @OneToMany(mappedBy="candidate")
    private Set<Application> applications;
}
