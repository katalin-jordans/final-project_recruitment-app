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
public class HiringManager extends User {
    @OneToMany(mappedBy="hiringManager")
    private Set<Job> jobs;
}
