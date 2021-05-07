package com.spring.data.jpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.data.jpa.entity.Person;

public interface PersonRepository<P> extends CrudRepository<Person, Long> {
	
	List<Person> findByFirstName(String firstName);
	
	List<Person> findByLastName(String lastName);

	Person findOne(Long id);

}
