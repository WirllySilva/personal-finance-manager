package com.personalfinancemanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index"; // Isso vai procurar por um arquivo chamado "index.html" na pasta
                        // "resources/templates"
    }

}
