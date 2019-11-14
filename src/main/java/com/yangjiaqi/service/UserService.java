package com.yangjiaqi.service;

import com.github.pagehelper.PageInfo;
import com.yangjiaqi.entity.User;

public interface UserService {

	PageInfo<User> getPageList(String name, Integer page);

	/**
	 * ����id��ȡ�û���Ϣ
	 * @param userId
	 * @return
	 */
	User getUserById(Integer userId);

	/**
	 *  �޸��û���״̬ Ҳ���ǽ���ͷ��
	 * @param userId
	 * @param status
	 * @return
	 */
	int updateStatus(Integer userId, int status);


}
