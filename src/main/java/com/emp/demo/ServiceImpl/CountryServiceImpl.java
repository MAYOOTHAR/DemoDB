package com.emp.demo.ServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.emp.demo.Model.Country;
import com.emp.demo.Repository.CountryRepository;
import com.emp.demo.Service.CountryService;
@Service
public class CountryServiceImpl implements CountryService{
	@Autowired
	CountryRepository countryRepository;

   @Override
	public Country saveCountry(Country country) {
		return countryRepository.save(country);
		
	}
	@Override
	public List<Country> getAllCountries(){
		return countryRepository.findAll();
		
	}
	@Override
	public Country findId(long id){
		
	return countryRepository.findById(id);
			//.orElseThrow(() ->new ResourceNotFoundException("Country","Id",id));
	}
	@Override
	public Country updateCountry(Country country, long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteCountry(long id) {
		// TODO Auto-generated method stub
		
	}

}
