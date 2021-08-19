package com.emp.demo.Service;

import java.util.List;
import com.emp.demo.Model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee Employee(long id);
	List<Employee> findByName(String name);
	Employee updateEmployee(Employee employee,long id);
    void deleteEmployee(long id);
}
