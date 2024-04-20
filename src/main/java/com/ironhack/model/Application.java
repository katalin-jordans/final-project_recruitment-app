package com.ironhack.model;

import com.ironhack.model.enums.ApplicationStage;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "application")
@Data
@NoArgsConstructor
public class Application {
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name="id")
    private Candidate candidate;
    @ManyToOne
    @JoinColumn(name="id")
    private Job job;
    private Date applicationDate;
    @Enumerated(EnumType.STRING)
    private ApplicationStage stage;
    private int interviewRound;
}
