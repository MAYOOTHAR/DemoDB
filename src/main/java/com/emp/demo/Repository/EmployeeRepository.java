package com.emp.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.emp.demo.Model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> { 
	@Query(value = "SELECT * from Employee where name = ?1",nativeQuery = true)
	List<Employee> findByName(String name);


}
