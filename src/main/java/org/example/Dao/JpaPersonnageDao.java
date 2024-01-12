package org.example.Dao;

import org.example.Entity.PersonnageEntity;
import org.example.Monde.Arme;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.sql.SQLOutput;
import java.util.StringJoiner;

public class JpaPersonnageDao implements PersonnageDao{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ib-unit");
    @Override
    public PersonnageEntity findById(Long id) {
        PersonnageEntity personnageToFind = null;

        EntityManager em = null;
        EntityTransaction tx = null;

        /**
         * @param id
         * @return
         */
        try {
            em = emf.createEntityManager();
            tx = em.getTransaction();
            tx.begin();

            personnageToFind = em.find(PersonnageEntity.class, id);

            System.out.println(new StringJoiner(" ").add("Le personnage id : ")
                    .add(id.toString())
                    .add("est :")
                    .add(personnageToFind.getNom()));
            tx.commit();

        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return personnageToFind;
    }


    @Override
    public void save(PersonnageEntity personnageEntity) {
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(personnageEntity);
            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }

    /**
     * @param id
     */
    @Override
    public void deleteById(Long id) {

    }

    /**
     * @param personnageEntity
     */
    @Override
    public void update(PersonnageEntity personnageEntity) {

    }
}
