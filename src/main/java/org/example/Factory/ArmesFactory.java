package org.example.Factory;

import org.example.Monde.Arme;

import java.util.Random;

public class ArmesFactory {

    /**
     * Créer une arme avec un boolean random pour
     * definir epee ou gourdin, et ensuite créer des points d'attaque
     * une longueur et un poids aleatoire
     *
     * ajoute d'un critique 1% de chance si legendary = 100
     * (grace a un random) 0 à 100 l'arme sera critique
     * soit "legendary" et fera 10 fois plus de dégâts
     *
     * de plus le poids sera diviser par legendary (10)
     * et sera donc 10 fois plus legere pour eventuellement
     * une vitesse d'attaque de même pour la longueur sera x10
     *
     * @return arme, qui est un objet Arme
     */
    public static Arme build(){
        Arme arme = null;
        Boolean cKoa = new Random().nextBoolean();
        String cSaKomArm = (cKoa ? "Épée" : "Gourdin");
        String nomArme = trouverNomArmeDeWorldOfJavaWsh(cSaKomArm);
        int legendary = (new Random().nextInt(0,100) == 100 ? 10 : 1);
        //ternaire si chiffre random de 0 a 100  = 100
        //alors legendary = 10 sinon 1
        int degat = (new Random().nextInt(2, 30))*legendary;
        int poids = (new Random().nextInt(200, 1000))/legendary;
        int longueur = (new Random().nextInt(50, 110))*legendary;
        arme = new Arme(nomArme, degat, longueur, poids, cSaKomArm);
        return arme;
    }

    /**
     * methode qui permet de créer un nom selon le
     * "type" d'arme qui est défini par un String
     * Soit Epee ou Gourdin
     * @param cSaKomArm
     * @return nomArme, qui est un string du nom de l'arme
     */
    public static String trouverNomArmeDeWorldOfJavaWsh(String cSaKomArm){
        String nomArme = (  cSaKomArm == "Épée" ?
                                    nomEpee[new Random().nextInt(nomEpee.length)] :
                            cSaKomArm == "Gourdin" ?
                                    nomGourdin[new Random().nextInt(nomGourdin.length)] :
                            "ERREUUUUUUUR");
        //ternaire si le cSaKomArm = Epee prends une id random du tableau nomEpee
        //sinon si cSaKomArm = Gourdin de même pour tableau gourdin
        return nomArme;
    }

    /**
     * Tableau de String qui stocke des
     * noms d'armes d'épée legendaire
     */
    public static String[] nomEpee = new String[]{
            "Excaliburne", "Excalibure", "Balisarde", "Baptism", "Closamont",
            "Courrouge", "Courtain", "Dolereuse", "Durandal", "Durandil", "Epee Runique"
    };
    /**
     * Tableau de String qui stocke des
     * noms d'armes de gourdin legendaire
     */
    public static String[] nomGourdin = new String[]{
            "Trique", "TAPER", "GOURDIN", "Groudin", "Massue", "Gordius",
            "Gorge", "Masse", "Sceptre", "Lampadaire de Jax", "Mjöllnir", "Philippe"
    };

}
