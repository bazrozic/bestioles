package com.epsi.b3.c1.tp03.Bestioles.repository;

import com.epsi.b3.c1.tp03.Bestioles.model.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpeciesRepository extends JpaRepository<Species, Integer> {

    Species findFirstByCommonNameEquals(String commonName);

    Species findAllByLatinNameContainsIgnoreCase(String latinName);

    @Query("SELECT s FROM Species s ORDER BY s.commonName ASC")
    List<Species> findAllByQuery();

    @Query("SELECT s FROM Species s WHERE s.commonName LIKE %?1%")
    List<Species> findAllByCommonNameContains(String commonName);
}