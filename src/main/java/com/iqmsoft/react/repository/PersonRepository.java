package com.iqmsoft.react.repository;

import org.springframework.data.repository.CrudRepository;

import com.iqmsoft.react.entity.Person;


public interface PersonRepository extends CrudRepository<Person, Long> {
}