package com.geunbok.onlinevotingsys.controller.dto;

import com.geunbok.onlinevotingsys.domain.Candidate;
import lombok.Getter;

@Getter
public class CandidateResponseDto {
    private Long id;
    private String department;
    private String candidate1;
    private String candidate2;

    public CandidateResponseDto(Candidate entity) {
        this.id = entity.getId();
        this.department = entity.getDepartment();
        this.candidate1 = entity.getCandidate1();
        this.candidate2 = entity.getCandidate2();
    }
}
