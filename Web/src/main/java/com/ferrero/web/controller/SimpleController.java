package com.ferrero.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SimpleController {

    @Value("${spring.application.name}")
    String appName;

    @GetMapping(value = {"", "/", "/home"})
    public String home(Model model) {
        model.addAttribute("appName",appName);
        return "home";
    }

    @GetMapping(value = "/error")
    public String error() {
        return "error";
    }
}