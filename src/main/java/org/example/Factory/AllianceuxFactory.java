package org.example.Factory;

import org.example.Monde.Alliance;
import org.example.Monde.Horde;
import org.example.Monde.Personnage;

import java.util.Random;

public class AllianceuxFactory extends PersonnagesFactory{

    public static Personnage build(String nom){
        Personnage perso = new Alliance(nom, PointDeVie(), ArmesFactory.build());
        return perso;
    }

    /**
     * Créer les points de vie du personnage
     * effet critique interne avec legendary
     * qui permet de multiplié les pv par 100
     * si le random 1-100 est critique (a 100)
     * @return
     */
    public static int PointDeVie(){
        int legendary;
        legendary = (new Random().nextInt(0,100) == 100 ? 100 : 1);//ternaire : Random = 100 ? legendary = 100 sinon 1
        int PointDeVie = (new Random().nextInt(25, 100))*legendary;
        return PointDeVie;
    }


}
