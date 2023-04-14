package org.example.entity;

public class Compte {
    private CompteBancaire compte;

    public Compte(CompteBancaire compte) {
        this.compte = compte;
    }

    public CompteBancaire getCompte() {
        return compte;
    }

    public void setCompte(CompteBancaire compte) {
        this.compte = compte;
    }
}
