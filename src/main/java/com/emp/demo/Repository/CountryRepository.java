package com.emp.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.demo.Model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country,Long>{
          Country findById(long id);
}
