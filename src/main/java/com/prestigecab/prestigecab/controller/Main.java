package com.prestigecab.prestigecab.controller;
import com.prestigecab.prestigecab.Formulaire;
import com.prestigecab.prestigecab.Model.Vehicules;
import com.prestigecab.prestigecab.dto.VehiculeDTO;

import com.prestigecab.prestigecab.services.VoituresDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@Controller
public class Main {
    private VoituresDataSource voituresDataSource;

    @Autowired
    public Main(VoituresDataSource voituresDataSource){
        this.voituresDataSource=voituresDataSource;
    }

//    @GetMapping("/")
//    public String Index(){
//        return "index";
//    }
//    @GetMapping("/contact")
//    public String Contact(){
//        return "index";
//    }
//    @GetMapping("/vehicule")
//    public String Vehicule(){
//        return "index";
//    }
//    @GetMapping("/admin")
//    public String Admin(){
//        return "index";
//    }
//    @GetMapping("/admin/editvehicule/{id}")
//    public String Edit(){
//        return "index";
//    }
//    @GetMapping("/berline")
//    public String Berline(){
//        return "index";
//    }
//    @GetMapping("/citadine")
//    public String Citadine(){
//        return "index";
//    }
//    @GetMapping("/utilitaire")
//    public String Utilitaire(){
//        return "index";
//    }
//    @GetMapping("/suv")
//    public String Suv(){
//        return "index";
//    }
//    @GetMapping("/monospace")
//    public String Monospace(){
//        return "index";
//    }
//    @GetMapping("/sport")
//    public String Sport(){
//        return "index";
//    }

    @GetMapping("/admin/{id}")
    public String Vehicule(Model model, @PathVariable(name = "id") Long id,VehiculeDTO vehicule){
        Vehicules vehicules=voituresDataSource.getVehicule(id);
        if (vehicules.getId()==null)return "redirect:/admin/add";
        VehiculeDTO dto=new VehiculeDTO();
        dto.setId(vehicules.getId());
        dto.setNom(vehicules.getNom());
        dto.setDescription(vehicules.getDescription());
        dto.setPrix(vehicules.getPrix());
        dto.setImage1(vehicules.getImage1());
        dto.setImage2(vehicules.getImage2());
        dto.setImage3(vehicules.getImage3());
        dto.setType(vehicules.getType().getId());
        model.addAttribute("vehicules",dto);
        model.addAttribute("types",voituresDataSource.getTypes());
        return "vehiculesform";
    }

    @GetMapping("/admin/add")
    public String ajouterVehicule(Model model){
        model.addAttribute("vehicules",new VehiculeDTO());
        model.addAttribute("types",voituresDataSource.getTypes());
        return "vehiculesform";
    }


    @PostMapping("/vehicule")
    public String postVehicule(@ModelAttribute(name = "vehicule") VehiculeDTO vehicule){
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
    public String Berline(Model model){
        model.addAttribute("vehicules",voituresDataSource.getVehiculeByCategory(2L));
        return "berline";
    }

    @GetMapping("/citadine")
    public String Citadine(Model model){
        model.addAttribute("vehicules",voituresDataSource.getVehiculeByCategory(3L));
        return "citadine";
    }

    @GetMapping("/utilitaire")
    public String Utilitaire(Model model){
        model.addAttribute("vehicules",voituresDataSource.getVehiculeByCategory(6L));

        return "utilitaire";
    }

    @GetMapping("/monospace")
    public String Monospace(Model model){
        model.addAttribute("vehicules",voituresDataSource.getVehiculeByCategory(4L));

        return "monospace";
    }

    @GetMapping("/suv")
    public String Suv(Model model){
        model.addAttribute("vehicules",voituresDataSource.getVehiculeByCategory(1L));

        return "suv";
    }

    @GetMapping("/sport")
    public String Sport(Model model){
        model.addAttribute("vehicules",voituresDataSource.getVehiculeByCategory(5L));

        return "sport";
    }

    @GetMapping("/contact")
    public String Contact(){
        return "contact";
    }
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("vehicules",voituresDataSource.getVehicules());
        return "Accueil";
    }
}
