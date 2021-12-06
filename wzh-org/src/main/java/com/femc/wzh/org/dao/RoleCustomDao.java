package com.femc.wzh.org.dao;

import java.util.List;
import java.util.Map;

import com.femc.wzh.common.entity.PageModel;
import com.femc.wzh.org.dto.RoleQueryDTO;
import com.femc.wzh.org.entity.Role;

public interface RoleCustomDao {
	
	public List<Role> findRoles(Map<String, Object> params);
	
	/**
	 * 根据查询条件查询角色分页信息
	 * @param userQueryDTO
	 * @return
	 */
	PageModel<Role> queryRolePage(RoleQueryDTO roleQueryDTO);
	
}
