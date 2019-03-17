package com.registration.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

import com.registration.modal.Countries;
import com.registration.modal.Courses;
import com.registration.modal.Student;
import com.registration.repository.CountryRepository;
import com.registration.repository.CourseRepository;
import com.registration.repository.UserRepository;

@Service
@Transactional
public class CountryService{
	
	private CountryRepository countryRepository;

	public CountryService(CountryRepository countryRepository){
		this.countryRepository = countryRepository;
	}
	
	public void saveCourse(Countries countries) {
		countryRepository.save(countries);
	}
	
	public List<Countries> getAllCountries() {
		List<Countries> countries = new ArrayList<Countries>();
		for(Countries country : countryRepository.findAll()) {
			countries.add(country);
		}
		
		return countries;
	}
	
	public Optional<Countries> getCountryById(int id) {
		Optional<Countries> country = countryRepository.findById(id);
		return country;
	}
	
}
