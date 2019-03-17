package com.registration.repository;

import org.springframework.data.repository.CrudRepository;

import com.registration.modal.Countries;

public interface CountryRepository  extends CrudRepository<Countries, Integer>{
	

}
