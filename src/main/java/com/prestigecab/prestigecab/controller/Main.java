package com.prestigecab.prestigecab.controller;
import com.prestigecab.prestigecab.Formulaire;
import com.prestigecab.prestigecab.Model.Vehicules;
import com.prestigecab.prestigecab.formdata.VehiculesFormDTO;
import com.prestigecab.prestigecab.services.VoituresDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
        model.addAttribute("vehicules",voituresDataSource.getVehicules());
        return "index";
    }

    @GetMapping("/admin/{id}")
    public String Vehicule(Model model, @PathVariable(name = "id") Long id){
        Vehicules vehicules=voituresDataSource.getVehicule(id);
        VehiculesFormDTO dto=new VehiculesFormDTO();
        dto.setId(vehicules.getId());
        dto.setNom(vehicules.getNom());
        dto.setDescription(vehicules.getDescription());
        dto.setPrix(vehicules.getPrix());
        dto.setImage1(vehicules.getImage1());
        dto.setImage2(vehicules.getImage2());
        dto.setImage3(vehicules.getImage3());
        model.addAttribute("vehicules",dto);
        return "vehiculesform";
    }
    @PostMapping("/vehicule")
    public String postVehicule(@ModelAttribute(name = "vehicule")VehiculesFormDTO vehicule){
        voituresDataSource.saveVehicule(vehicule);
        return "redirect:/admin";
    }
    @GetMapping("admin/delete/{id}")
    public String deleteFilm(@PathVariable(name = "id") long id){
        voituresDataSource.deleteVehicule(id);
        return "redirect:/admin";
    }

    @GetMapping("/admin")
    public String Admin(@ModelAttribute(name = "formulaire") Formulaire formulaire,Model model){
    model.addAttribute("vehicules",voituresDataSource.getVehicules());
    return "admin";
    }

    @GetMapping("/login")
    public String Login( Model model,HttpServletRequest req){
    return "login";
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
