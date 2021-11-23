package edu.ntudp.sau.fadieieva.javaspringbootlab6.controllers;

import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainControllers {
    @GetMapping("/main")
    public String MainPage(Model model) {
        model.addAttribute("color", "cool white, warm white, blue, purple, multicolor");
        return "main";
    }
    @GetMapping("/")
    public String init(Model model) {
        model.addAttribute("color", "cool white, warm white, blue, purple, multicolor");
        return "main";
    }
}