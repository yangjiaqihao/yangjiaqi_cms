package com.yangjiaqi.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.yangjiaqi.common.MsgResult;
import com.yangjiaqi.entity.User;
import com.yangjiaqi.service.UserService;

/**
 * 
 *
 */

@Controller
@RequestMapping("admin")
public class AdminController {
	
	/**
	 * 
	 */
	@Autowired
	UserService userService;
	
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping("index")
	public String index() {
		return "amdin/index";
	}
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping("articles")
	public String articles() {
		return "amdin/article/list";
	}
	
	/**
	 * 
	 * @param request
	 * @param name
	 * @param page
	 * @return
	 */
	@RequestMapping("users")
	public String users(HttpServletRequest request,
			@RequestParam(defaultValue="") String name,
			@RequestParam(defaultValue="1") Integer page) {
		
		PageInfo<User> userPage =  userService.getPageList(name,page);
		request.setAttribute("info", userPage);
		request.setAttribute("name", name);
		
		return "amdin/user/list";
	}
	
	/**
	 * �û���������û�
	 * @param userId
	 * @param status
	 * @return
	 */
	@RequestMapping("lockuser")
	@ResponseBody
	public MsgResult lock(Integer userId,int status) {
		
		/**
		 * 
		 */
		if(status != 0 && status!=1) {
			return new MsgResult(2,"������Ч",null);
		}
		
		/**
		 * 
		 */
		User user  = userService.getUserById(userId);
		
		/**
		 * 
		 */
		if(user == null) {
			return new MsgResult(2,"���û�������",null);
		}
		
		/**
		 * 
		 */
		if(user.getLocked()==status) {
			return new MsgResult(2,"�������ò���",null);
		}
		
		int result = userService.updateStatus(userId,status);
		if(result>0) {
			return new MsgResult(1,"��ϲ��������ɹ�",null);
		}else{
			return new MsgResult(2,"�ǳ���Ǹ������ʧ�ܣ��������Ա��ϵ��",null);
		}
		
		
		
		
		
		
		
	}
	
	

}
