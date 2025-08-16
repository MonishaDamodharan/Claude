package com.api.claude.service;

import com.api.claude.constant.Constant;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;

import java.util.*;

@Service
public class ClaudeService {
    private final String CLAUDE_API_URL = "https://api.anthropic.com/v1/messages";

    @Value("${spring.ai.anthropic.api-key}")
    private String API_KEY;

    public String getClaudeResponse(String prompt) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("x-api-key", API_KEY);
        headers.set("anthropic-version", "2023-06-01"); // Required header

        Map<String, Object> body = new HashMap<>();
        body.put("model", "claude-sonnet-4-20250514"); // or another available model
        body.put("max_tokens", 1024);

        List<Map<String, String>> messages = new ArrayList<>();
        Map<String, String> userMessage = new HashMap<>();
        userMessage.put("role", "user");
        userMessage.put("content", getPrompt());
        messages.add(userMessage);

        body.put("messages", messages);

        String requestBody;
        try {
            requestBody = new ObjectMapper().writeValueAsString(body);
        } catch (Exception e) {
            throw new RuntimeException("Failed to build JSON", e);
        }


        try {
            HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);
            ResponseEntity<String> response = restTemplate.postForEntity(CLAUDE_API_URL, entity, String.class);
            return response.getBody();
        }catch (ResourceAccessException e) {
            throw new RuntimeException("Failed to connect to Anthropic API: " + e.getMessage(), e);
        }

    }

    public String getPrompt(){
        String conv = Constant.conversation;
        String prompt = "Consider yourself as a clinical psychologist and u want you to create clinical notes based on the template of format i share in any format, I want the notes to be hippa compliant and clear. I want you to generate clinical notes based on the patient and psychologist conversation or transcript I share. The psychologist is marked as doctor and patient is marked as user. Respond in markup format"+
                Constant.conversation + "above is the conversation between doctor and patient, now you are a doctor, please fill the template below with the information from the conversation.\n" +
                Constant.template;
        return prompt;
    }
}