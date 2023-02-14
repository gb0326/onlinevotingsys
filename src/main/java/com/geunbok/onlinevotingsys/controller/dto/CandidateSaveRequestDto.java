package com.geunbok.onlinevotingsys.controller.dto;

import com.geunbok.onlinevotingsys.domain.Candidate;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CandidateSaveRequestDto {
    private String department;
    private String candidate1;
    private String candidate2;

    @Builder
    public CandidateSaveRequestDto(String department, String candidate1, String candidate2) {
        this.department = department;
        this.candidate1 = candidate1;
        this.candidate2 = candidate2;
    }

    public Candidate toEntity() {
        return Candidate.builder()
                .candidate1(candidate1)
                .candidate2(candidate2)
                .department(department).build();
    }
}
