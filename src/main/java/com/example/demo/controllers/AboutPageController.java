package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutPageController {

    public AboutPageController() {
    }
    @GetMapping("/AboutPage")
    public String aboutPage() {
        return "AboutPage";
    }
}
