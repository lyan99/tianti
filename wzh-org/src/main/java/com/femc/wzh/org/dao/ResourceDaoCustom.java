package com.femc.wzh.org.dao;

import java.util.List;
import java.util.Map;

import com.femc.wzh.org.entity.Resource;


public interface ResourceDaoCustom {

	public List<Resource> findMenuResource(Map<String, Object> params);
	
}
