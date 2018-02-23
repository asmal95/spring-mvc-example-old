package edu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping
    public String index(ModelMap model) {
        model.addAttribute("message", "Hello from server!");
        return "index";
    }
}
