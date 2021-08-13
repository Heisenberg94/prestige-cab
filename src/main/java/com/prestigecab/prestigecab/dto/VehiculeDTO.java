package com.prestigecab.prestigecab.dto;

import com.prestigecab.prestigecab.Model.Type;
import com.prestigecab.prestigecab.Model.Vehicules;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.ManyToOne;

public class VehiculeDTO {

    private Long id;
    private String nom;
    private String description;
    private long prix;
    private String image1;
    private String image2;
    private String image3;
    private Long type;

    public VehiculeDTO() {
    }

    public VehiculeDTO(Vehicules vehicules) {
        this.id= vehicules.getId();
        this.nom = vehicules.getNom();
        this.description = vehicules.getDescription();
        this.prix = vehicules.getPrix();
        this.image1 = vehicules.getImage1();
        this.image2 = vehicules.getImage2();
        this.image3 = vehicules.getImage3();
        this.type = vehicules.getType().getId();
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrix() {
        return prix;
    }

    public void setPrix(long prix) {
        this.prix = prix;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
