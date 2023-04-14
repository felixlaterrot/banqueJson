package org.example.square;

public class Square extends Rectangle {
    public Square(int hauteur, int largeur) {
        super(hauteur, largeur);
    }

    public int calculAire(){
        return this.getHauteur() * this.getLargeur();
    }
}
