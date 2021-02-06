package com.prestigecab.prestigecab;

public class Formulaire {
    private String nom;
    private String password;


    public Formulaire(String nom, String password) {
        this.nom = nom;
        this.password = password;


    }

    public Formulaire() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

