package com.geunbok.onlinevotingsys.controller.dto;

import com.geunbok.onlinevotingsys.domain.Vote;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.Convert;

@Getter
public class VoteSaveRequestDto {
    private Long positive;
    private Long negative;

    @Builder
    public VoteSaveRequestDto(Long positive, Long negative) {
        this.positive = positive;
        this.negative = negative;
    }

    public Vote toEntity() {
        return Vote.builder()
                .positive(positive)
                .negative(negative)
                .build();
    }
}
