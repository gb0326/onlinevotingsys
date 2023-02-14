package com.geunbok.onlinevotingsys.controller;

import com.geunbok.onlinevotingsys.controller.dto.CandidateResponseDto;
import com.geunbok.onlinevotingsys.service.CandidateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class IndexController {
    private final CandidateService candidateService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("candidate", candidateService.findAllDesc());

        return "index";
    }
    @GetMapping("/candidate/save")
    public String candidateSave() {
        return "candidate-save";
    }
    @GetMapping("/candidate/update/{id}")
    public String candidateUpdate(@PathVariable Long id, Model model) {
        CandidateResponseDto dto = candidateService.findById(id);
        model.addAttribute("candidate", dto);

        return "candidate-update";
    }
}
