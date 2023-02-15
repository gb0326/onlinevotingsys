package com.geunbok.onlinevotingsys.service;

import com.geunbok.onlinevotingsys.controller.dto.VoteResultResponseDto;
import com.geunbok.onlinevotingsys.controller.dto.VoteSaveRequestDto;
import com.geunbok.onlinevotingsys.domain.Vote;
import com.geunbok.onlinevotingsys.domain.VoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class VoteService {
    private final VoteRepository voteRepository;

    @Transactional
    public Long positive(VoteSaveRequestDto requestDto) {
        return voteRepository.save(requestDto.toEntity()).getPositive();
    }

    @Transactional
    public Long negative(VoteSaveRequestDto requestDto) {
        return voteRepository.save(requestDto.toEntity()).getNegative();
    }

    public VoteResultResponseDto findById(Long id) {
        Vote entity = voteRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("해당 후보자가 없습니다. id = " + id));

        return new VoteResultResponseDto(entity);
    }

    @Transactional(readOnly = true)
    public List<VoteResultResponseDto> findAllDesc() {
        return voteRepository.findAllDesc().stream()
                .map(VoteResultResponseDto::new)
                .collect(Collectors.toList());
    }
}
