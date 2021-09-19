package com.emp.demo.ServiceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.emp.demo.Model.City;
import com.emp.demo.Model.Country;
import com.emp.demo.Other.ResourceNotFoundException;
import com.emp.demo.Repository.CityRepository;
import com.emp.demo.Repository.CountryRepository;
import com.emp.demo.Request.CityRequest;
import com.emp.demo.Service.CityService;
@Service
public class CityserviceImpl implements CityService{
	@Autowired
	CityRepository cityRepository;
	
	@Autowired
	CountryRepository countryRepository;
   
	@Override
	public List<City> getAllCities(){
		return cityRepository.findAll();
	}
	@Override
	public City findById(long cityid){
		return cityRepository.findById(cityid).orElseThrow(() -> 
	              new ResourceNotFoundException("City","Id",cityid));
	}
	@Override
	public List<City> findByName(String name){
		return cityRepository.findByName(name);
	}
	@Override
	public City updateCity(City city, long id) {

		City exitingCity = findById(city.getId());
		exitingCity.setName(city.getName());
		exitingCity.setCode(city.getCode());
		cityRepository.save(exitingCity);
		return exitingCity;
	}
	@Override
	public void deleteCity(long id) {
		cityRepository.deleteById(id);  
	}
	@Override
	public City saveCity(CityRequest cityrequest) {
		System.out.println("cityrequest");
		Country country = countryRepository.findById(cityrequest.getCountry_id());
		City city = new City();
		city.setName(cityrequest.getName());
		city.setCode(cityrequest.getCode());
		city.setCountry(country);
		System.out.println("city"+city);
	    return cityRepository.save(city);
	}
}
