package com.emp.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.emp.demo.Model.Employee;
import com.emp.demo.Other.ResourceNotFoundException;
import com.emp.demo.Repository.EmployeeRepository;
import com.emp.demo.Service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	 EmployeeRepository employeeRepository;




	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
		
	}
	@Override
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
		
	}
	@Override
	public Employee Employee(long id){
		
	return employeeRepository.findById(id).orElseThrow(() -> 
	              new ResourceNotFoundException("Employee","Id",id));
	}
	@Override 
	public Employee updateEmployee(Employee employee,long id) {
		
		Employee existingEmployee = employeeRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Employee","Id","id"));
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		employeeRepository.save(existingEmployee);
		return existingEmployee;
	}
	@Override
	public void deleteEmployee(long id) {
		employeeRepository.findById(id).orElseThrow(() ->
		         new ResourceNotFoundException("Employee","Id",id));
		
		employeeRepository.deleteById(id);
	}
	@Override
	public List<Employee> findByName(String name) {
		return employeeRepository.findByName(name);
		
	}
}
