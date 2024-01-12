package org.example.Service;

import org.example.Entity.PersonnageEntity;
import org.hibernate.Session;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersonnageServiceHibernate {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("ib-unit");
    private static final Session session = emf.createEntityManager().unwrap(Session.class);

    /**
     * Créer un nouveau perso dans la base de donnée
     *
     * @param personnage, PersonnageEntity car Personnage n'as pas été créer
     *               pour être intégrer en hibernate, donc il y a l'objet
     *               PersonnageEntity et Personnage
     */
    public static void save(PersonnageEntity personnage){
            session.beginTransaction();
            session.save(personnage);
            session.getTransaction().commit();
    }

    /**
     * chercher un Personnage par id
     * @param id
     * @return
     */
    public static PersonnageEntity find(Long id) {
        return session.find(PersonnageEntity.class, id);
    }
    /**
     * mets à jours dans la base de donnée
     * en entrant un PersonnageEntity
     */
    public static void update(PersonnageEntity person){
        session.beginTransaction();
        session.update(person);
        session.getTransaction().commit();
    }

    /**
     * Supprimer un personnage selon l'id
     *
     * @param id
     */
    public static void deleteById(Long id){
        session.beginTransaction();
        session.delete(session.find(PersonnageEntity.class, id));
        session.getTransaction().commit();
    }


}
