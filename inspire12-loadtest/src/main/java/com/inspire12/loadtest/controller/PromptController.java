package com.inspire12.loadtest.controller;

import com.inspire12.loadtest.service.PromptService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PromptController {
    private final PromptService promptService;
}
