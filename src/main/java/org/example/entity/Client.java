package org.example.entity;

import java.io.Serializable;

public class Client implements Serializable {
    private int idClient;
    private String nom;
    private String prenom;

    public Client(int idClient, String nom, String prenom) {
        this.idClient = idClient;
        this.nom = nom;
        this.prenom = prenom;
    }
    public Client(){}

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}