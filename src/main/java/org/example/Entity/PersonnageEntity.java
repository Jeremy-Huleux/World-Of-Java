package org.example.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "personnage")
public class PersonnageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name="pointDeVie", nullable = false)
    private int pointDeVie;

    public PersonnageEntity(String nom, int pointDeVie){
        this.nom = nom;
        this.pointDeVie= pointDeVie;
    }

}
