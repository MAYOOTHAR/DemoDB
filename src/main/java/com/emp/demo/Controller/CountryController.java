package com.emp.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.emp.demo.Model.Country;
import com.emp.demo.Service.CountryService;

@RestController
@RequestMapping("/api/country")
public class CountryController {
	@Autowired
	private CountryService countryService;

	@PostMapping()
	public ResponseEntity<Country> saveCountry(@RequestBody Country country) {
		System.out.println(country);
		return new ResponseEntity<Country>(countryService.saveCountry(country), HttpStatus.CREATED);
    }
	@GetMapping()
	public List<Country> getAllCountries() {
		return countryService.getAllCountries();
	}
    @GetMapping("{id}")
	public ResponseEntity<Country> getcountrybyId(@PathVariable("id") long countryId) {
		return new ResponseEntity<Country>(countryService.findId(countryId), HttpStatus.OK);

	}

}
