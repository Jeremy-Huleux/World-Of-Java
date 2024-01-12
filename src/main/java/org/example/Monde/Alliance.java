package org.example.Monde;

public class Alliance extends Personnage{
    @Override
    public boolean isA2ouH2() {
        return true;
    }

    public Alliance() {
        super();
    }

    public Alliance(String nom, int pointsDeVie, Arme arme) {

        super(nom, pointsDeVie, arme);
    }


    /**
     * Methode attaque qui permettras de supprimer
     * des points de vie a l'adversaire
     * @param arme, prends en parametre arme pour connaitre les degats causé a l'ennemi
     */
    /*
    @Override
    public int attaque(Personnage adversaire){
        return super.attaque(adversaire);
    }

     */
    /**
     * Methode recevoirDgt qui permettras de supprimer
     * directement les points de vie du personnage
     * lors de la reception de dgt
     * @param dgt, prends en parametre un int généré par
     *             la methode attaque
     */
/*
    @Override
    public int recevoirDgt(int dgt){
        return super.recevoirDgt(dgt);
    }*/
}
