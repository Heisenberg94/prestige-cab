package com.prestigecab.prestigecab.dao;

import com.prestigecab.prestigecab.Model.Type;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TypeRepository extends CrudRepository<Type,Long> {
//    List<Type> findTypesByCategory_Id(Long idCateg);

}
