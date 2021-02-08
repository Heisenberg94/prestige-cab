package com.prestigecab.prestigecab.controller;
import com.prestigecab.prestigecab.Formulaire;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Main {

    @GetMapping("/")
    public String Index(){

        return "index";
    }

    @GetMapping("/login")
    public String Login( Model model,HttpServletRequest req){

        return "login";
    }

    @PostMapping("/admin")
    public String Admin(@ModelAttribute(name = "formulaire") Formulaire formulaire,Model model){
        model.addAttribute("formulaire",formulaire);
        return "admin";
    }

    @GetMapping("/berline")
    public String Berline(){

        return "berline";
    }

    @GetMapping("/citadine")
    public String Citadine(){

        return "citadine";
    }

    @GetMapping("/utilitaire")
    public String Utilitaire(){

        return "utilitaire";
    }
    @GetMapping("/monospace")
    public String Monospace(){

        return "monospace";
    }

    @GetMapping("/suv")
    public String Suv(){

        return "suv";
    }

    @GetMapping("/sport")
    public String Sport(){

        return "sport";
    }

    @GetMapping("/contact")
    public String Contact(){

        return "contact";
    }
}
