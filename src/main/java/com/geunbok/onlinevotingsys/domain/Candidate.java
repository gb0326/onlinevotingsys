package com.geunbok.onlinevotingsys.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Candidate extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String department; //학과

    @Column
    private String candidate1; //학회장

    @Column
    private String candidate2; //부학회장

    @Builder
    public Candidate(String department, String candidate1, String candidate2) {
        this.department = department;
        this.candidate1 = candidate1;
        this.candidate2 = candidate2;
    }

    public void update(String department, String candidate1, String candidate2) {
        this.department = department;
        this.candidate1 = candidate1;
        this.candidate2 = candidate2;
    }
}

