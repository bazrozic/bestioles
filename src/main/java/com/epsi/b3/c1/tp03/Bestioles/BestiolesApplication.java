package com.epsi.b3.c1.tp03.Bestioles;

import com.epsi.b3.c1.tp03.Bestioles.repository.AnimalRepository;
import com.epsi.b3.c1.tp03.Bestioles.repository.PersonRepository;
import com.epsi.b3.c1.tp03.Bestioles.repository.RoleRepository;
import com.epsi.b3.c1.tp03.Bestioles.repository.SpeciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class BestiolesApplication implements CommandLineRunner {

	private final PersonRepository personRepository;
	private final AnimalRepository animalRepository;
	private final RoleRepository roleRepository;
	private final SpeciesRepository speciesRepository;

	public static void main(String[] args) {
		SpringApplication.run(BestiolesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(speciesRepository.findFirstByCommonNameEquals("Chien"));

		System.out.println(speciesRepository.findAllByLatinNameContainsIgnoreCase("canis"));

		System.out.println(personRepository.findFirstByLastnameEqualsIgnoreCaseOrFirstnameEqualsIgnoreCase("LaMarque", "John"));

		System.out.println(personRepository.findAllByAgeIsGreaterThanEqual(30));

		System.out.println(animalRepository.findAllBySpecies_CommonName("Chien"));

		System.out.println(animalRepository.findAllByColorIsIn(List.of("Noir", "Blanc")));
	}

	@Autowired
	public BestiolesApplication(PersonRepository personRepository, AnimalRepository animalRepository, RoleRepository roleRepository, SpeciesRepository speciesRepository) {
		this.personRepository = personRepository;
		this.animalRepository = animalRepository;
		this.roleRepository = roleRepository;
		this.speciesRepository = speciesRepository;
	}
}
