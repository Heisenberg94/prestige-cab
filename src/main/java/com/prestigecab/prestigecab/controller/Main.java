package com.prestigecab.prestigecab.controller;
import com.prestigecab.prestigecab.Formulaire;
import com.prestigecab.prestigecab.services.VoituresDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Main {
    private VoituresDataSource voituresDataSource;

    @Autowired
    public Main(VoituresDataSource voituresDataSource){
        this.voituresDataSource=voituresDataSource;
    }

    @GetMapping("/")
    public String Index(Model model){
        model.addAttribute("items",voituresDataSource.getItems());
        return "index";
    }

    @GetMapping("/login")
    public String Login( Model model,HttpServletRequest req){

        return "login.html";
    }

    @PostMapping("/admin")
    public String Admin(@ModelAttribute(name = "formulaire") Formulaire formulaire,Model model){
        model.addAttribute("formulaire",formulaire);
        return "admin.html";
    }

    @GetMapping("/berline")
    public String Berline(){

        return "berline.html";
    }

    @GetMapping("/citadine")
    public String Citadine(){

        return "citadine.html";
    }

    @GetMapping("/utilitaire")
    public String Utilitaire(){

        return "utilitaire.html";
    }
    @GetMapping("/monospace")
    public String Monospace(){

        return "monospace.html";
    }

    @GetMapping("/suv")
    public String Suv(){

        return "suv.html";
    }

    @GetMapping("/sport")
    public String Sport(){

        return "sport.html";
    }

    @GetMapping("/contact")
    public String Contact(){

        return "contact.html";
    }
}
