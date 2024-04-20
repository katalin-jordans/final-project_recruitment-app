package com.ironhack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
public class Recruiter extends User {
    private int target;
    private int numberOfPlacements;
    @OneToMany(mappedBy="recruiter")
    private Set<Job> jobs;
}