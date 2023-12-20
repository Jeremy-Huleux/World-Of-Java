package org.example.Monde;

public class Arme {
    private String nom;
    private int pDgtParAtt; //Points de dégâts par attaque
    private int longueur;
    private int poids;
    private String type;

    public Arme(String nom, int pDgtParAtt, int longueur, int poids, String type) {
        this.nom = nom;
        this.pDgtParAtt = pDgtParAtt;
        this.longueur = longueur;
        this.poids = poids;
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getpDgtParAtt() {
        return pDgtParAtt;
    }

    public void setpDgtParAtt(int pDgtParAtt) {
        this.pDgtParAtt = pDgtParAtt;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
