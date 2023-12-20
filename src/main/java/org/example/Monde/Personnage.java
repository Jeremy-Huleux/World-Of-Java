package org.example.Monde;

import java.util.StringJoiner;

public abstract class Personnage {
    private String nom;
    private int pointsDeVie;
    private Arme arme;

    public Personnage() {

    }

    /**
     * Methode attaque qui permettras de supprimer
     * des points de vie a l'adversaire
     * @param adversaire, prends en parametre un adversaire qui aura une arme set
     */
    public int attaque(Personnage adversaire){
        adversaire.recevoirDgt(this.arme.getpDgtParAtt());
        return this.arme.getpDgtParAtt();
    }

    /**
     * Methode recevoirDgt qui permettras de supprimer
     * directement les points de vie du personnage
     * lors de la reception de dgt
     * @param dgt, prends en parametre un int généré par
     *             la methode attaque
     */
    public void recevoirDgt(int dgt){
        this.pointsDeVie =- dgt;
    }

    public Personnage(String nom, int pointsDeVie, Arme arme) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.arme = arme;
    }

    public String getNom() {
        return nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public Arme getArme() {
        return arme;
    }

    @Override
    public String toString() {
        return new StringJoiner("\n", Personnage.class.getSimpleName() + "[", "]")
                .add("nom='" + nom + "'")
                .add("pointsDeVie=" + pointsDeVie)
                .add("arme : " + arme.getType())
                .toString();
    }
}
