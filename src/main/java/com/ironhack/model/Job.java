package com.ironhack.model;

import com.ironhack.model.enums.JobStatus;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "job")
@Data
@NoArgsConstructor
public class Job {
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name="id")
    private HiringManager hiringManager;
    @ManyToOne
    @JoinColumn(name="id")
    private Recruiter recruiter;
    private String jobTitle;
    private String jobDescription;
    @Enumerated(EnumType.STRING)
    private JobStatus status;
}
