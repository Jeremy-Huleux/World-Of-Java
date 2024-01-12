package org.example.Dao;

import org.example.Entity.PersonnageEntity;

public interface PersonnageDao {
    PersonnageEntity findById(Long id);

    void save(PersonnageEntity personnageEntity);
    void deleteById(Long id);
    void update(PersonnageEntity personnageEntity);
}
