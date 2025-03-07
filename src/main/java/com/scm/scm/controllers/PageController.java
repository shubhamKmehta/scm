package com.scm.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("home handler page");
        model.addAttribute("name", "ShubhamKmehta");
        model.addAttribute("projectName", "Smart Contact Manager");
        model.addAttribute("githubRepo", "https://github.com/shubhamKmehta?tab=overview&from=2025-02-01&to=2025-02-26");
        return "home";
    }

    @RequestMapping("/about")
    public String about(){
        System.out.println("about page is loaading");
        return "about";

    }

    @RequestMapping("/services")
    public String servicePage() {
        System.out.println("service page is loading");
        return "services";
    }
    

}
