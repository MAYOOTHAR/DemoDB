package com.emp.demo.Service;

import java.util.List;



import com.emp.demo.Model.Role;

public interface RoleService   {
	Role saveRole(Role role);
	List<Role> getAllRoles();
	Role Role(long id);
	Role updateRole(Role role,long id);
    void deleteRole(long id);

}
