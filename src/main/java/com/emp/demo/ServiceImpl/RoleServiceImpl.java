package com.emp.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.emp.demo.Model.Role;
import com.emp.demo.Other.ResourceNotFoundException;
import com.emp.demo.Repository.RoleRepository;
import com.emp.demo.Service.RoleService;
@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
 RoleRepository roleRepository;

	@Override
	public Role saveRole(Role role) {
		return roleRepository.save(role);
		
	}

	@Override
	public List<Role> getAllRoles() {
		return roleRepository.findAll();
		
	}

	@Override
	public Role Role(long id) {
		return roleRepository.findById(id).orElseThrow(() -> 
        new ResourceNotFoundException("Role","Id",id));
		
	}

	@Override
	public Role updateRole(Role role, long id) {
		Role existingRole = roleRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Employee","Id","id"));
		existingRole.setName(role.getName());
		
		
		roleRepository.save(existingRole);
		return existingRole;
		
		
	}

	@Override
	public void deleteRole(long id) {
		roleRepository.findById(id).orElseThrow(() ->
        new ResourceNotFoundException("Role","Id",id));

        roleRepository.deleteById(id);
}
		
		
	}
	
	



