package com.yangjiaqi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yangjiaqi.common.ConstantClass;
import com.yangjiaqi.dao.ArticleMapper;
import com.yangjiaqi.entity.Article;
import com.yangjiaqi.service.ArticleService;

/**
 * 
 *
 */
@Service
public class ArticleServiceImpl  implements ArticleService{
	
	@Autowired
	ArticleMapper articleMapper;
	

	
	public List<Article> getNewArticles(int i) {
		// TODO Auto-generated method stub
		return articleMapper.newList(i);
	}

	
	public PageInfo<Article> hotList(int page) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, ConstantClass.PAGE_SIZE);
		return new PageInfo<Article>(articleMapper.hostList());
		
	}

}
