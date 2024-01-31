package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Myproject002Controller {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "ようこそ！Spring boot + Thymeleafへ！");
        return "index";
    }

    @RequestMapping("/input")
    public String input(Model model) {
        model.addAttribute("myproject002Form", new Myproject002Form());
        return "input";
    }

    @RequestMapping("/output")
    public String output(@ModelAttribute Myproject002Form myproject002Form, Model model) {
        model.addAttribute("myproject002Form", myproject002Form);
        return "output";
    }

}
