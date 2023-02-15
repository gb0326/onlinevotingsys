package com.geunbok.onlinevotingsys.controller.dto;

import com.geunbok.onlinevotingsys.domain.Vote;
import lombok.Getter;

@Getter
public class VoteResultResponseDto {
    private Long id;
    private Long positive;
    private Long negative;

    public VoteResultResponseDto(Vote entity) {
        this.id = entity.getId();
        this.positive = entity.getPositive();
        this.negative = entity.getNegative();
    }
}
