package org.example;

import org.example.Dao.JpaPersonnageDao;
import org.example.Entity.PersonnageEntity;
import org.example.Factory.EquipeFactory;
import org.example.Factory.PersonnagesFactory;
import org.example.Monde.Combat;
import org.example.Monde.Equipe;
import org.example.Monde.Personnage;
import org.example.Service.PersonnageServiceHibernate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Equipe equipe1 = new EquipeFactory().build(2, true);
        Equipe equipe2 = new EquipeFactory().build(2, false);

        Combat combat = new Combat(equipe1, equipe2);
        combat.startCombat();





        /**
         * Création de personnage dans la base
         * update etc
         */
        /*
        PersonnageServiceHibernate.save(new PersonnageEntity("Romain", 35));
        PersonnageServiceHibernate.save(new PersonnageEntity("Rachid", 29));
        System.out.printf("Le Personnage %d est %s%n", 1L, PersonnageServiceHibernate.find(1L).getNom());
        PersonnageEntity caro = new PersonnageEntity(2L, "Caroline", 29);
        PersonnageServiceHibernate.update(caro);
        PersonnageServiceHibernate.deleteById(1L);
        */



        }
    }
