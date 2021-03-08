package com.prestigecab.prestigecab.services;

import com.google.common.collect.Lists;
import com.prestigecab.prestigecab.Model.Vehicules;
import com.prestigecab.prestigecab.formdata.VehiculesFormDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class VoituresDataSource {
com.prestigecab.prestigecab.dao.VehiculesRepository VehiculesRepository;


@Autowired
public VoituresDataSource(com.prestigecab.prestigecab.dao.VehiculesRepository vehiculesRepository){

    this.VehiculesRepository =vehiculesRepository;
}

public List <Vehicules> getVehicules(){return Lists.newArrayList(VehiculesRepository.findAll());}

public Vehicules getVehicule(Long id){
    return VehiculesRepository.findById(id).orElse(new Vehicules());
}

public void deleteVehicule(long id){ VehiculesRepository.deleteById(id);}

public void saveVehicule(VehiculesFormDTO vehiculesDTO){
    Vehicules vehiculesDB = VehiculesRepository.findById(vehiculesDTO.getId()).orElse(new Vehicules());
    vehiculesDB.setNom(vehiculesDTO.getNom());
    vehiculesDB.setDescription(vehiculesDTO.getDescription());
    vehiculesDB.setPrix(vehiculesDTO.getPrix());
    vehiculesDB.setImage1(vehiculesDTO.getImage1());
    vehiculesDB.setImage2(vehiculesDTO.getImage2());
    vehiculesDB.setImage3(vehiculesDTO.getImage3());

    VehiculesRepository.save(vehiculesDB);
}
}
