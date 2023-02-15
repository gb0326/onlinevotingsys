package com.geunbok.onlinevotingsys.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
public class Vote extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long positive;

    @Column
    private Long negative;

    @Builder
    public Vote(Long positive, Long negative) {
        this.positive = positive;
        this.negative = negative;
    }

    public void count(Long positive, Long negative) {
        this.positive = positive;
        this.negative = negative;
    }
}
