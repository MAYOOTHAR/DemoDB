package com.emp.demo.Service;

import java.util.List;

import com.emp.demo.Model.Country;

public interface CountryService {
	Country saveCountry(Country country);
	List<Country> getAllCountries();
	Country findId(long id);
	Country updateCountry(Country country,long id);
    void deleteCountry(long id);


}
