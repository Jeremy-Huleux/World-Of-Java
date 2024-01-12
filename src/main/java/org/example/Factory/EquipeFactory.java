package org.example.Factory;

import org.example.Monde.Equipe;
import org.example.Monde.Personnage;

import java.util.ArrayList;
import java.util.List;

public class EquipeFactory extends Equipe {
    /**
     * factory d'equipe qui créer aleatoirement
     * une equipe de x = taille de la faction définis
     * aleatoirement, MAIS créer une equipe entierement constituer
     * de soit des hordeux soit des allianceux
     * et non pas les 2 mélangés
     * @param taille taille de l'équipe
     * @return Equipe
     */
    public static Equipe build(int taille){
        List<Personnage> list = new ArrayList<>();
        for(int i = 0; i<taille; i++){
            if(list.size() != 0){
                if(list.get(0).isA2ouH2()){
                    Personnage perso = new PersonnagesFactory().build(true);
                    list.add(perso);
                }else{
                    Personnage perso = new PersonnagesFactory().build(false);
                    list.add(perso);
                }
            }else {
                Personnage perso = new PersonnagesFactory().build();
                list.add(perso);
            }
        }
        return new Equipe(list);
    }

    /**
     * factory d'equipe qui créer aleatoirement
     * une equipe de x = taille de la faction définis
     * par le boolean a2ouH2, soit : true = allianceux
     * false = hordeux
     * @param taille taille de l'équipe
     * @param a2ouH2 TRUE = ALLIANCEUX FALSE = HORDEUX
     * @return Equipe
     */
    public static Equipe build(int taille, boolean a2ouH2){
        List<Personnage> list = new ArrayList<>();
        for(int i = 0; i<taille; i++){
            Personnage perso = new PersonnagesFactory().build(a2ouH2);
            list.add(perso);
        }
        return new Equipe(list);
    }

}
