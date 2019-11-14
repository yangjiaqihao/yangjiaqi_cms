package com.yangjiaqi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yangjiaqi.common.ConstantClass;
import com.yangjiaqi.dao.UserMapper;
import com.yangjiaqi.entity.User;
import com.yangjiaqi.service.UserService;

/**
 * 
 *
 */
@Service
//@Component
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper userMapper;

	public PageInfo<User> getPageList(String name, Integer page) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page,ConstantClass.PAGE_SIZE);
		return new PageInfo<User>(userMapper.list(name));
	}

	public User getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return userMapper.getById(userId);
	}

	public int updateStatus(Integer userId, int status) {
		// TODO Auto-generated method stub
		return userMapper.updateStatus(userId,status);
	}

}
