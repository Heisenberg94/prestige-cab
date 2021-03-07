package com.prestigecab.prestigecab.services;

import com.google.common.collect.Lists;
import com.prestigecab.prestigecab.Model.Vehicules;
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

public List <Vehicules> getVehicules(){
    return Lists.newArrayList(VehiculesRepository.findAll());
}

public Vehicules getVehicules(Long id){
    return VehiculesRepository.findById(id).orElse(new Vehicules());
}
public void deleteVehicules(long id){
    VehiculesRepository.deleteById(id);}

}
