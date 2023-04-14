package org.example.square;

public class Rectangle {
    private int hauteur;
    private int largeur;

    public Rectangle(int hauteur, int largeur) {
        this.hauteur = hauteur;
        this.largeur = largeur;
    }

    public String display(int hauteur, int largeur){
        String ligne = "";
        String carre = "";

        for(int e=0; e <largeur; e++){
            ligne += "#";
        }
        for(int e=0; e <hauteur; e++){
            carre += "\n" + ligne;
        }
        return carre;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }
}
