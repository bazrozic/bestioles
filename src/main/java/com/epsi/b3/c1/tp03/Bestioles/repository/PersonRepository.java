package com.epsi.b3.c1.tp03.Bestioles.repository;

import com.epsi.b3.c1.tp03.Bestioles.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>, PersonRepositoryCustom {

    Person findFirstByLastnameEqualsIgnoreCaseOrFirstnameEqualsIgnoreCase(String lastname, String firstname);

    List<Person> findAllByAgeIsGreaterThanEqual(Integer age);

    @Query("SELECT p FROM Person p WHERE p.age BETWEEN ?1 AND ?2")
    List<Person> findAllByAgeBetween(Integer agemin, Integer agemax);

    @Query("SELECT p FROM Person p INNER JOIN p.animals a WHERE a.name = ?1")
    List<Person> findAllByAnimalName(String animalName);

}
