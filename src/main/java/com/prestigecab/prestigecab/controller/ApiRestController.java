package com.prestigecab.prestigecab.controller;

import com.prestigecab.prestigecab.Model.Type;
import com.prestigecab.prestigecab.Model.Vehicules;
import com.prestigecab.prestigecab.dao.VehiculesRepository;
import com.prestigecab.prestigecab.dto.TypeDTO;
import com.prestigecab.prestigecab.dto.VehiculeDTO;

import com.prestigecab.prestigecab.services.VoituresDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiRestController {
    @Autowired
    private VoituresDataSource voituresDataSource;

    @GetMapping("/vehicule/api")
    public List<VehiculeDTO> vehicules(){
        return voituresDataSource.getVehiculesDTO(voituresDataSource.getVehicules());
    }


    @GetMapping("/vehicule/suv")
    public List<VehiculeDTO>suv(){
        return voituresDataSource.getVehiculeDTOSbyType_Id(1L);
    }

    @GetMapping("/vehicule/berline")
    public List<VehiculeDTO>berline(){
        return voituresDataSource.getVehiculeDTOSbyType_Id(2L);
    }

    @GetMapping("/vehicule/citadine")
    public List<VehiculeDTO>citadine(){
        return voituresDataSource.getVehiculeDTOSbyType_Id(3L);
    }
    @GetMapping("/vehicule/monospace")
    public List<VehiculeDTO>monospace(){
        return voituresDataSource.getVehiculeDTOSbyType_Id(4L);
    }
    @GetMapping("/vehicule/sport")
    public List<VehiculeDTO>sport(){
        return voituresDataSource.getVehiculeDTOSbyType_Id(5L);
    }
    @GetMapping("/vehicule/utilitaire")
    public List<VehiculeDTO>utilitaire(){
        return voituresDataSource.getVehiculeDTOSbyType_Id(6L);
    }

    @DeleteMapping("/admin/deletevehicule/{id}")
    public void delete(@PathVariable(name = "id") long deleteID){
        voituresDataSource.deleteVehicule(deleteID);
    }

    @PatchMapping ("/admin/addvehicule/{id}")
    public void add(@PathVariable(name = "id")  VehiculeDTO vehicule){
        VehiculeDTO dto=new VehiculeDTO();
        dto.setId(vehicule.getId());
        dto.setNom(vehicule.getNom());
        dto.setDescription(vehicule.getDescription());
        dto.setPrix(vehicule.getPrix());
        dto.setImage1(vehicule.getImage1());
        dto.setImage2(vehicule.getImage2());
        dto.setImage3(vehicule.getImage3());
        dto.setType(vehicule.getType());
    }

    @PostMapping("/admin/vehicule")
    public void post(@RequestBody VehiculeDTO vehiculeDTO){
        voituresDataSource.saveVehicule(vehiculeDTO);
    }

    @GetMapping("/admin/types")
    public List<TypeDTO> getTypes(){
       return voituresDataSource.getTypesDTO();
    }

    @GetMapping("/admin/vehicule/{id}")
    public VehiculeDTO getVehicule(@PathVariable(name = "id") Long id){
        return voituresDataSource.getVehiculeDTO(id);
    }



}
