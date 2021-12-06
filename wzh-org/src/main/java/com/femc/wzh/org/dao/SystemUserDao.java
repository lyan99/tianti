package com.femc.wzh.org.dao;


import java.util.List;
import java.util.Map;

import com.femc.wzh.common.entity.PageModel;
import com.femc.wzh.org.dto.UserQueryDTO;
import com.femc.wzh.org.entity.User;

public interface SystemUserDao {
	
	public List<User> findUsers(Map<String, Object> params);
	
	/**
	 * 根据用户信息查询分页信息
	 * @param userQueryDTO
	 * @return
	 */
	PageModel<User> queryUserPage(UserQueryDTO userQueryDTO);
	
}
