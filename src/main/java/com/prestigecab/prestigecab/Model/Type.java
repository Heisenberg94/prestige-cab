package com.prestigecab.prestigecab.Model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "TYPE")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID",nullable = false)
    private long id;
    @Basic
    @Column(name = "NAME",nullable = false)
    private String nom;
    @ManyToOne
    @JoinColumn(name = "CATEGORY")
    private Vehicules vehicules;

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

    public Vehicules getVehicules() {
        return vehicules;
    }

    public void setVehicules(Vehicules vehicules) {
        this.vehicules = vehicules;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Type type = (Type) o;
        return id == type.id && nom.equals(type.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom);
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
