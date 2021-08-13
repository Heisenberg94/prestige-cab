package com.prestigecab.prestigecab.Model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "VEHICULES")
public class Vehicules {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    @Column(name = "NAME", nullable = false, length = 1000)
    private String nom;
    @Basic
    @Column(name = "DESCRIPTION", nullable = false, length = 1000)
    private String description;
    @Basic
    @Column(name = "PRICE",nullable = false)
    private long prix;
    @Basic
    @Column(name = "IMAGE1",nullable = false,length = 250)
    private String image1;
    @Basic
    @Column(name = "IMAGE2",nullable = false,length = 250)
    private String image2;
    @Basic
    @Column(name = "IMAGE3",nullable = false,length = 250)
    private String image3;
    @ManyToOne
    private Type type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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


    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicules vehicules = (Vehicules) o;
        return id == vehicules.id && prix == vehicules.prix && nom.equals(vehicules.nom) && description.equals(vehicules.description) && image1.equals(vehicules.image1) && image2.equals(vehicules.image2) && image3.equals(vehicules.image3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, description, prix, image1, image2, image3);
    }
}