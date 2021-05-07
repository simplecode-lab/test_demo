package com.spring.data.jpa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.data.jpa.entity.Person;
import com.spring.data.jpa.repository.PersonRepository;

public class PersonService {

	@Autowired
	PersonRepository<Person> personRepository;

	@Transactional
	public List<Person> findByFirstName(String firstName) {
		return personRepository.findByFirstName(firstName);

	}

	public List<Person> getAllPerson() {
		return (List<Person>) personRepository.findAll();

	}

	public Person getById(Long id) {
		return personRepository.findOne(id);
	}
}
