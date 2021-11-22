package edu.ntudp.sau.fadieieva.javaspringbootlab6.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductControllers {
    @GetMapping("/products")
    public String CatalogeProducts(Model model) {
        return "products";
    }

}
