package com.directory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("name","VP-Infotech Pvt. Ltd.");
        model.addAttribute("channel", "https://www.youtube.com/@UjjawalSrivastavaYour_code");
        System.out.println("Welcome to Home Page");
        return "home";
    }

    @GetMapping("/about")
    public String aboutPage() {
        System.out.println("about page loading");
        return "about";
    }

    @GetMapping("/services")
    public String servicesPage() {
        System.out.println("Services page loading");
        return "services";
    }
    
}
