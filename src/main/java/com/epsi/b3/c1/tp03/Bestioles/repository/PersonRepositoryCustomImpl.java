package com.epsi.b3.c1.tp03.Bestioles.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

public class PersonRepositoryCustomImpl {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public boolean doesAnimalBelongToAnyPerson(Integer animalId) {
        String query = "SELECT CASE WHEN COUNT(p) > 0 THEN true ELSE false END FROM Person p JOIN p.animals a WHERE a.id = :animalId";
        return entityManager.createQuery(query, Boolean.class)
                .setParameter("animalId", animalId)
                .getSingleResult();
    }
}
