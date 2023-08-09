package br.com.erudio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.models.Person;
import br.com.erudio.services.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonService service;
	
	
	@RequestMapping(method=RequestMethod.POST,
					produces = MediaType.APPLICATION_JSON_VALUE,
					consumes = MediaType.APPLICATION_JSON_VALUE)
	public Person createPerson(@RequestBody Person persons){

		return service.createPerson(persons);

	}
	@RequestMapping(method=RequestMethod.PUT,
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public Person updatePerson(@RequestBody Person persons){

		return service.updatePerson(persons);

	}
	@RequestMapping(value = "/{id}", 
			method=RequestMethod.DELETE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteById(@PathVariable(value = "id")String id) throws Exception {

		return service.deletePerson(id);

	}
	
	@RequestMapping(value = "/{id}", 
					method=RequestMethod.GET,
					produces = MediaType.APPLICATION_JSON_VALUE)
	public Person personById(@PathVariable(value = "id")String id) throws Exception {
		
		return service.findById(id);
		
	}
	@RequestMapping(method=RequestMethod.GET,
					produces = MediaType.APPLICATION_JSON_VALUE)
	public List allPerson()throws Exception {

		return service.findAll();

	}
	

}
