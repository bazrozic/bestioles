package com.epsi.b3.c1.tp03.Bestioles.repository;

import com.epsi.b3.c1.tp03.Bestioles.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

    Person findFirstByLastnameEqualsIgnoreCaseOrFirstnameEqualsIgnoreCase(String lastname, String firstname);

    List<Person> findAllByAgeIsGreaterThanEqual(Integer age);
}
