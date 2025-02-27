package com.epsi.b3.c1.tp03.Bestioles;

import com.epsi.b3.c1.tp03.Bestioles.repository.AnimalRepository;
import com.epsi.b3.c1.tp03.Bestioles.repository.PersonRepository;
import com.epsi.b3.c1.tp03.Bestioles.repository.RoleRepository;
import com.epsi.b3.c1.tp03.Bestioles.repository.SpeciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BestiolesApplication implements CommandLineRunner {

	private PersonRepository personRepository;
	private AnimalRepository animalRepository;
	private RoleRepository roleRepository;
	private SpeciesRepository speciesRepository;

	public static void main(String[] args) {
		SpringApplication.run(BestiolesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("person avant delete" + this.personRepository.findAll());

		System.out.println(this.animalRepository.findById(1));

		System.out.println(this.roleRepository.findAll());

		System.out.println(this.speciesRepository.findAll());

		personRepository.deleteById(1);

		System.out.println("person après delete" + this.personRepository.findAll());

		System.out.println(this.animalRepository.findAll());

	}

	@Autowired
	public BestiolesApplication(PersonRepository personRepository, AnimalRepository animalRepository, RoleRepository roleRepository, SpeciesRepository speciesRepository) {
		this.personRepository = personRepository;
		this.animalRepository = animalRepository;
		this.roleRepository = roleRepository;
		this.speciesRepository = speciesRepository;
	}
}
