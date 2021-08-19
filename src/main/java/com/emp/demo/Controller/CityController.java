package com.emp.demo.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.emp.demo.Model.City;
import com.emp.demo.Request.CityRequest;
import com.emp.demo.Service.CityService;

@RestController
@RequestMapping("/api/city")
public class CityController {

	@Autowired
	private CityService cityService;

	@PostMapping()
	public ResponseEntity<City> saveCity(@RequestBody CityRequest cityrequest) {
		System.out.println("cityrequest"+cityrequest);
		return new ResponseEntity<City>(cityService.saveCity(cityrequest), HttpStatus.CREATED);
	}
	@GetMapping()
	public List<City> getAllCities() {
		return cityService.getAllCities();
	}
	@GetMapping("{id}")
	public ResponseEntity<City> getCitybyId(@PathVariable("id") long cityId) {
		return new ResponseEntity<City>(cityService.findById(cityId), HttpStatus.OK);
	}
	@GetMapping("/city")
	public ResponseEntity<List<City>> getCityName(@RequestParam("name") String name) {
		return new ResponseEntity<List<City>>(cityService.findByName(name), HttpStatus.OK);
	}
	@PutMapping("{id}")
	public ResponseEntity<City> updateCity(@PathVariable("id") long id, @RequestBody City city) {
		return new ResponseEntity<City>(cityService.updateCity(city, id), HttpStatus.OK);
	}
	@DeleteMapping()
    public ResponseEntity<String> deleteCity(@RequestParam("id") long id) {
       System.out.println("update city " + id);
       cityService.deleteCity(id);
       return new ResponseEntity<String>("Deleted Successfully!", HttpStatus.OK);
    }

	

}
