package com.yangjiaqi.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.yangjiaqi.entity.Article;

public interface ArticleService {

	/**
	 * ��ȡ��������
	 * @param i  ��ȡ�ĸ���
	 * @return
	 */
	List<Article> getNewArticles(int i);

	/**
	 * ��ȡ��������
	 * @param page
	 * @return
	 */
	PageInfo<Article> hotList(int page);
	

}
