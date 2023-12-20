package org.example.Monde;

public class Horde extends Personnage{
    public Horde() {
        super();

    }

    public Horde(String nom, int pointsDeVie, Arme arme) {

        super(nom, pointsDeVie, arme);
    }

    /**
     * Methode attaque qui permettras de supprimer
     * des points de vie a l'adversaire
     *
     * @param arme
     */
    @Override
    public int attaque(Arme arme) {
        return super.attaque(arme);
    }

    /**
     * Methode recevoirDgt qui permettras de supprimer
     * directement les points de vie du personnage
     * lors de la reception de dgt
     *
     * @param dgt
     */
    @Override
    public int recevoirDgt(int dgt) {
        return super.recevoirDgt(dgt);
    }

}
