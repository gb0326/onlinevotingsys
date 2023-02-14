package com.geunbok.onlinevotingsys.controller.dto;

import com.geunbok.onlinevotingsys.domain.Candidate;

import java.time.LocalDateTime;

public class CandidateListResponseDto {
    private Long id;
    private String department;
    private String candidate1;
    private String candidate2;
    private LocalDateTime modifiedDate;

    public CandidateListResponseDto(Candidate entity) {
        this.id = entity.getId();
        this.department = entity.getDepartment();
        this.candidate1 = entity.getCandidate1();
        this.candidate2 = entity.getCandidate2();
        this.modifiedDate = entity.getModifiedDate();
    }
}
