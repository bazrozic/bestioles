package com.epsi.b3.c1.tp03.Bestioles.repository;

import com.epsi.b3.c1.tp03.Bestioles.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    List<Animal> findAllBySpecies_CommonName(String speciesCommonName);

    List<Animal> findAllByColorIsIn(Collection<String> colors);

    @Query("SELECT COUNT(a) FROM Animal a WHERE a.sex = ?1")
    Integer countBySexe(String sexe);

    @Query("SELECT CASE WHEN COUNT(p) > 0 THEN true ELSE false END FROM Person p JOIN p.animals a WHERE a.id = :animalId")
    boolean existsByAnimalId(Integer animalId);

}
