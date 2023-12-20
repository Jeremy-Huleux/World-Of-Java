package org.example.Factory;

import org.example.Monde.Alliance;
import org.example.Monde.Horde;
import org.example.Monde.Personnage;

import java.util.Random;
import java.util.StringJoiner;


public class PersonnagesFactory {

    /**
     * Créer un personnage avec tous ses attributs
     * Avec un nom aleatoire qui proviens d'une table
     * de prefixe + nom + suffixe
     * Ensuite il créer un boolean aleatoire pour décider si le
     * personnage sera Horde ou Alliance
     * Il envera par la suite a la prochaine factory
     * donc HordeuxFactory
     * ou AllianceuxFactory
     * Peut créer un personnage full aleatoire SINON mettre un boolean
     * TRUE = Alliance
     * FALSE = Horde
     * @return
     *
     */
    public static Personnage build(Boolean h2ouA2){
        String nom = String.valueOf(new StringJoiner("")
                .add(affixeNom[new Random().nextInt(affixeNom.length)])
                .add(middleNom[new Random().nextInt(affixeNom.length)])
                .add(suffixeNom[new Random().nextInt(affixeNom.length)]));

        if(h2ouA2){
            return AllianceuxFactory.build(nom);
        }else{
            return HordeuxFactory.build(nom);
        }
    };


    public static Personnage build(){
        Boolean allianceHorde;
        String nom = String.valueOf(new StringJoiner("")
                .add(affixeNom[new Random().nextInt(affixeNom.length)])
                .add(middleNom[new Random().nextInt(affixeNom.length)])
                .add(suffixeNom[new Random().nextInt(affixeNom.length)]));

        allianceHorde = new Random().nextBoolean();
        if(allianceHorde){
            return AllianceuxFactory.build(nom);
        }else{
            return HordeuxFactory.build(nom);
        }
    };
    /**
     * Créer un tableau d'affixe qui se placera
     * avant le middle nom par exemple :
     * xXx MidlleNom suffixe le tout collé
     */
    public static String[] affixeNom = new String[]{
      "Dark","xXx","XxXx","XoXoXo", "RoxXx", "Super", "DarkDark",
      "Giga", "Ultra", "GigaDark", "Speed"
    };
    /**
     * Créer un tableau de suffixe qui se placera
     * apres le middle nom par exemple :
     * prefixe MidlleNom Roxxor le tout collé
     */
    public static String[] suffixeNom = new String[]{
            "LeRoxxor","Roxx","Roxxor", "92", "93", "94", "95", "93", "77",
            "75","78", "Du92", "Du93", "Du94", "Du95", "Du93", "Du77",
            "Du75","Du78", "xXxX", "XoXoXo", "xX"
    };
    /**
     * Créer un tableau de nom (middleNom) qui se placera
     * au milieu du nom par exemple :
     * prefixe Pierre suffixe le tout collé
     */
    public static String[] middleNom = new String[]{
            "Naruto", "Boruto", "SanGoku", "Goku", "Vegeta", "YameteKudasai",
            "Yoda", "Spiderman", "Superman", "Batman", "Luffy", "Zoro", "Pikachu",
            "Dracofeu", "Pierre"
    };


}
