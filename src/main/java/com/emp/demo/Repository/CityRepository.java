package com.emp.demo.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.emp.demo.Model.City;

@Repository
public interface CityRepository extends JpaRepository<City,Long> {
	@Query(value = "SELECT * from cities where name = ?1",nativeQuery = true)
	List<City> findByName(String name);
}
