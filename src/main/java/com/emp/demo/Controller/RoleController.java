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
import org.springframework.web.bind.annotation.RestController;

import com.emp.demo.Model.Role;
import com.emp.demo.Service.EmployeeService;
import com.emp.demo.Service.RoleService;
@RestController
@RequestMapping("/api/role")
public class RoleController { 
	
	@Autowired
	private RoleService roleService;

   
	
	@PostMapping()
	public ResponseEntity<Role> saveRole(@RequestBody Role role){
		return new ResponseEntity<Role>(roleService.saveRole(role), HttpStatus.CREATED);
}
	
	@GetMapping()
	public List<Role> getAllRoles(){
		return roleService.getAllRoles();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Role> Role(@PathVariable("id") long RoleId){
		return new ResponseEntity<Role>(roleService.Role(RoleId), HttpStatus.OK);
	
	}	
	@PutMapping("{id}")
	public ResponseEntity<Role> updateRole(@PathVariable("id") long id,
			                                       @RequestBody Role Role){
		return new ResponseEntity<Role>(roleService.updateRole(Role,id), HttpStatus.OK);
}
	@DeleteMapping("{id}")
	public  ResponseEntity<String> deleteRole(@PathVariable("id") long id){
		
		roleService.deleteRole(id);
		return new ResponseEntity<String>("Role deleted successfully!",HttpStatus.OK);
		
}


}
