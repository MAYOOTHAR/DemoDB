package com.emp.demo.Service;

import java.util.List;
import com.emp.demo.Model.City;
import com.emp.demo.Request.CityRequest;

public interface CityService {
	City saveCity(CityRequest cityrequest);
	List<City> getAllCities();
	City findById(long cityid);
	City updateCity(City city,long id);
    void deleteCity(long id);
	List<City> findByName(String name);
	
}
