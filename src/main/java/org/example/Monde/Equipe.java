package org.example.Monde;

import java.util.ArrayList;
import java.util.List;
//Todo : Continuer Equipe trouver solution pour utilisation simple
public class Equipe {

    List<Personnage> list = new ArrayList<>();
    int taille;
    Personnage perso;

    public Equipe(int taille, Personnage perso) {
        this.taille = taille;
        this.perso = perso;
    }

    public Equipe(int taille) {this.taille = taille;}
    public Equipe() {}

    public void ajoutEquipe(Personnage perso) {

    }
    public void persoEquipMort(Personnage perso){

    }
}
