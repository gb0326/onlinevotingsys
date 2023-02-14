package com.geunbok.onlinevotingsys.controller.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CandidateUpdateRequestDto {
    private String department;
    private String candidate1;
    private String candidate2;

    @Builder
    public CandidateUpdateRequestDto(String department, String candidate1, String candidate2) {
        this.department = department;
        this.candidate1 = candidate1;
        this.candidate2 = candidate2;
    }
}
