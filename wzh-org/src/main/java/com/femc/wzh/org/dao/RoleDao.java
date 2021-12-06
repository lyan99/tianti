package com.femc.wzh.org.dao;


import org.springframework.data.jpa.repository.Query;

import com.femc.wzh.common.dao.CommonDao;
import com.femc.wzh.org.entity.Role;

public interface RoleDao extends RoleCustomDao,CommonDao<Role,String>{

	@Query("from Role r where r.roleName = ?1 ")
	public Role findByRoleName(String roleName);
	
}
