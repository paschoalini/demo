package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("v1/demo")
public class DemoApplicationController {
    @GetMapping("/index")
    public ResponseEntity<String> index() {
        return ResponseEntity.ok("Executando com sucesso.");
    }
}
