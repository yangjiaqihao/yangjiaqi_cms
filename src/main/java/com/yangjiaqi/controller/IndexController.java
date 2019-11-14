package com.yangjiaqi.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.yangjiaqi.entity.Article;
import com.yangjiaqi.entity.Channel;
import com.yangjiaqi.service.ArticleService;
import com.yangjiaqi.service.ChannelService;

@Controller
public class IndexController {

	/**
	 * ע��Ƶ��
	 */
	@Autowired
	ChannelService channelService;
	
	
	@Autowired
	ArticleService articleService;

	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = { "index", "/" })
	public String index(HttpServletRequest request, @RequestParam(defaultValue = "1") int page) {

		//��ȡ���е�Ƶ��
		List<Channel> channels = channelService.list();
		request.setAttribute("channels", channels);
		
		PageInfo<Article> hotList = articleService.hotList(page);
		
		List<Article> newArticles = articleService.getNewArticles(5);
		
		request.setAttribute("hotList", hotList);
		request.setAttribute("newArticles", newArticles);
		
		
		
		
		//
		
		return "index";
	}

}
