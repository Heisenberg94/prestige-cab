package com.prestigecab.prestigecab.dto;

import com.prestigecab.prestigecab.Model.Type;

public class TypeDTO {
    private long id;
    private String nom;

   public TypeDTO(){

    }
   public TypeDTO(Type type){
        id= type.getId();
        nom= type.getNom();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
