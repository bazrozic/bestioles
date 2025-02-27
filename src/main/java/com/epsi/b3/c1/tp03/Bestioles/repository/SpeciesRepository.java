package com.epsi.b3.c1.tp03.Bestioles.repository;

import com.epsi.b3.c1.tp03.Bestioles.model.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeciesRepository extends JpaRepository<Species, Integer> {

    Species findFirstByCommonNameEquals(String commonName);

    Species findAllByLatinNameContainsIgnoreCase(String latinName);
}
