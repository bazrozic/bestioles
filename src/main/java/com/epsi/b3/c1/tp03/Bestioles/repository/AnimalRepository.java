package com.epsi.b3.c1.tp03.Bestioles.repository;

import com.epsi.b3.c1.tp03.Bestioles.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

}
