package com.api.claude.controller;

import com.api.claude.service.ClaudeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/claude")
public class ClaudeController {
    @Autowired
    private ClaudeService claudeService;

    @PostMapping("/prompt")
    public String getClaudeResponse(@RequestBody String prompt) {
        return claudeService.getClaudeResponse(prompt);
    }
}

