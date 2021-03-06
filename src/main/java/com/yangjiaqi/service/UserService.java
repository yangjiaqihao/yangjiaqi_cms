package com.yangjiaqi.service;

import com.github.pagehelper.PageInfo;
import com.yangjiaqi.entity.User;

public interface UserService {

	PageInfo<User> getPageList(String name, Integer page);

	/**
	 * 根据id获取用户信息
	 * @param userId
	 * @return
	 */
	User getUserById(Integer userId);

	/**
	 *  修改用户的状态 也就是解禁和封禁
	 * @param userId
	 * @param status
	 * @return
	 */
	int updateStatus(Integer userId, int status);


}
