package com.prestigecab.prestigecab.dao;

import com.prestigecab.prestigecab.Model.Vehicules;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VehiculesRepository extends CrudRepository <Vehicules,Long> {
    List<Vehicules> findByType_Id(Long type_id);


}
