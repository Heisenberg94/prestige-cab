package com.prestigecab.prestigecab.services;

import com.google.common.collect.Lists;
import com.prestigecab.prestigecab.Model.Type;
import com.prestigecab.prestigecab.Model.Vehicules;
import com.prestigecab.prestigecab.dao.TypeRepository;
import com.prestigecab.prestigecab.dao.VehiculesRepository;
import com.prestigecab.prestigecab.dto.TypeDTO;
import com.prestigecab.prestigecab.formdata.TypeFormDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import com.prestigecab.prestigecab.dto.VehiculeDTO;

import java.util.ArrayList;
import java.util.List;


@Service
public class VoituresDataSource {
com.prestigecab.prestigecab.dao.VehiculesRepository VehiculesRepository;
TypeRepository typeRepository;


@Autowired
public VoituresDataSource(com.prestigecab.prestigecab.dao.VehiculesRepository vehiculesRepository,TypeRepository typeRepository ){

    this.VehiculesRepository =vehiculesRepository;
    this.typeRepository=typeRepository;
}

public List <Vehicules> getVehicules(){return Lists.newArrayList(VehiculesRepository.findAll());}


public List <VehiculeDTO> getVehiculesDTO( List<Vehicules> vehiculesList){
    List<VehiculeDTO>vehiculeDTOS = new ArrayList<>();


    for (Vehicules vehicules:vehiculesList) {
        vehiculeDTOS.add(new VehiculeDTO(vehicules));
    }
    return vehiculeDTOS;
}

public List<VehiculeDTO>getVehiculeDTOSbyType_Id(Long typeId){
    return getVehiculesDTO(VehiculesRepository.findByType_Id(typeId));
}

public Vehicules getVehicule(Long id){
    return VehiculesRepository.findById(id).orElse(new Vehicules());
}

public void deleteVehicule(long id){ VehiculesRepository.deleteById(id);}

    public List<Vehicules>getVehiculeByCategory(Long idCateg){
        return VehiculesRepository.findByType_Id(idCateg);
    }

public void saveVehicule(VehiculeDTO vehiculesDTO){
    Vehicules vehiculesDB = new Vehicules();
    if (vehiculesDTO.getId() != null) {
        vehiculesDB = VehiculesRepository.findById(vehiculesDTO.getId()).orElse(new Vehicules());
    }
    vehiculesDB.setNom(vehiculesDTO.getNom());
    vehiculesDB.setDescription(vehiculesDTO.getDescription());
    vehiculesDB.setPrix(vehiculesDTO.getPrix());
    vehiculesDB.setImage1(vehiculesDTO.getImage1());
    vehiculesDB.setImage2(vehiculesDTO.getImage2());
    vehiculesDB.setImage3(vehiculesDTO.getImage3());
    vehiculesDB.setType(getType(vehiculesDTO.getType()));
    VehiculesRepository.save(vehiculesDB);
}
    public List<Type> getTypes(){
        return Lists.newArrayList(typeRepository.findAll());
    }

    public List<TypeDTO> getTypesDTO(){
        List<TypeDTO>typeDTOS=new ArrayList<>();
        for (Type type:typeRepository.findAll()){
            typeDTOS.add(new TypeDTO(type));
        }
        return typeDTOS;
    }
    public Type getType(Long id){
        return typeRepository.findById(id).orElse(new Type());
    }
    public VehiculeDTO getVehiculeDTO(Long id){
    return new VehiculeDTO(getVehicule(id));
    }

}
