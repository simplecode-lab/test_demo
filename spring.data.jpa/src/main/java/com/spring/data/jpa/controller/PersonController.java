package com.spring.data.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.data.jpa.entity.Person;
import com.spring.data.jpa.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@RequestMapping(value = "/person/{id}",method = RequestMethod.GET)
	@ResponseBody
	public Person getAllUser(@PathVariable Long id) {
		return personService.getById(id);
	}
	
	@RequestMapping(value = "personByName/{name}",method = RequestMethod.GET)
	@ResponseBody
	public List<Person> findByFirstName(@PathVariable String firstName){
		return personService.findByFirstName(firstName);
		
	}
}
