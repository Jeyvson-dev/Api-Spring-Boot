package br.com.erudio.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;

import br.com.erudio.models.Person;

@Service
public class PersonService {

	private final AtomicLong counter = new AtomicLong();
	private static final Logger logger = LoggerFactory.getLogger(PersonService.class);
	
	
	public Person findById(String id) {
		
		
		logger.info("Finding a person");
		Person person = new Person();
		person.setId(counter.getAndIncrement());
		person.setFirstNama("Jeyvson");
		person.setLastName("Moreira");
		person.setAdress("Jaboatão dos Guararapes, Pernambuco - PE");
		person.setGender("Male");
		
		return person;
	}
	public Person createPerson(Person person) {
		
		logger.info("Creating a person");
		person.setId(counter.getAndIncrement());
			
		return person;
		
	}
	public Person updatePerson(Person person) {
		
		logger.info("Updating a person");
		person.setId(counter.getAndIncrement());
			
		return person;
		
	}
	public String deletePerson(String idPerson) {
		
		logger.info("Deleting a person");
					
		return idPerson;
		
	}
	
	public List findAll() {
		
		logger.info("Finding all person");
		List<Person> persons = new ArrayList();
		
		for(Integer i = 1; i <8; i++) {
			
			persons.add(mockPerson(i));
		}
		
		return persons;
		
	}
	private Person mockPerson(Integer i) {
			
		Person person = new Person();
		person.setId(counter.getAndIncrement());
		person.setFirstNama("First Name " + i);
		person.setLastName("Last Name " + i);
		person.setAdress("Some Adress " + i);
		person.setGender("Some Gender " + i);
		
		return person;
		
	}

}
