package org.example.entity;

import java.io.Serializable;

public class CompteBancaire implements Serializable {
    private Client client;
    private int numCompteBancaire;
    private int fondDisponible;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setNumCompteBancaire(int numCompteBancaire) {
        this.numCompteBancaire = numCompteBancaire;
    }

    public void setFondDisponible(int fondDisponible) {
        this.fondDisponible = fondDisponible;
    }

    public CompteBancaire(Client client, int numCompteBancaire, int fondDisponible) {
        this.client = client;
        this.numCompteBancaire = numCompteBancaire;
        this.fondDisponible = fondDisponible;
    }
    public CompteBancaire(){}

    public int getNumCompteBancaire() {
        return numCompteBancaire;
    }

    public int getFondDisponible() {
        return fondDisponible;
    }

    public void retirerArgent(int fond){
        if(this.fondDisponible > fond){
            fondDisponible -= fond;
            System.out.println("Argent envoyé");
        } else {
            System.out.println("Fond non disponible");
        }
    }
    public void crediterCompte(int fond){
        fondDisponible += fond;
        System.out.println("Argent envoyé");
    }
}