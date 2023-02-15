package com.geunbok.onlinevotingsys.controller;

import com.geunbok.onlinevotingsys.controller.dto.VoteResultResponseDto;
import com.geunbok.onlinevotingsys.controller.dto.VoteSaveRequestDto;
import com.geunbok.onlinevotingsys.service.CandidateService;
import com.geunbok.onlinevotingsys.service.VoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class VoteApiController {
    private final CandidateService candidateService;
    private final VoteService voteService;

    @PostMapping("/api/v1/vote/positive")
    public Long positive(@RequestBody VoteSaveRequestDto requestDto) {
        return voteService.positive(requestDto);
    }

    @PostMapping("/api/v1/vote/negative")
    public Long negative(@RequestBody VoteSaveRequestDto requestDto) {
        return voteService.negative(requestDto);
    }

    @GetMapping("/api/v1/vote/{id}")
    public String vote(@PathVariable Long id) {
        VoteResultResponseDto dto = voteService.findById(id);

        return "vote";
    }
}
