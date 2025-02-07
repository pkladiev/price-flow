package com.kladiev.core_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ProductController {
    @GetMapping
    public String getTestMessage() {
        return "Hello from core-service!";
    }
}
