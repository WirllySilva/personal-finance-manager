package com.personalfinancemanager.financemanager.controller;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @GetMapping("path")
    public ResponseEntity<String> home() throws IOException {
        Resource resource = new ClassPathResource("static/subdiretorio/index.html");

        try (Scanner scanner = new Scanner(resource.getInputStream(), StandardCharsets.UTF_8)) {
            String content = scanner.useDelimiter("\\A").next();
            return ResponseEntity.ok().contentType(MediaType.TEXT_HTML).body(content);
        }
    }

}
