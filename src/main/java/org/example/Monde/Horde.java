package org.example.Monde;

public class Horde extends Personnage{
    public Horde() {
        super();

    }

    public Horde(String nom, int pointsDeVie, Arme arme) {

        super(nom, pointsDeVie, arme);
    }

    public boolean isA2ouH2() {
        return false;
    }
    /**
     * Methode attaque qui permettras de supprimer
     * des points de vie a l'adversaire
     *
     * @param adversaire
     */
    /*
    @Override
    public int attaque(Personnage adversaire) {
        return super.attaque(adversaire);
    }
*/
    /**
     * Methode recevoirDgt qui permettras de supprimer
     * directement les points de vie du personnage
     * lors de la reception de dgt
     *
     * @param dgt
     */
    /*
    @Override
    public int recevoirDgt(int dgt) {
        return super.recevoirDgt(dgt);
    }*/

}
