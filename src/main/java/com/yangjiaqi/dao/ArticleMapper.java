package com.yangjiaqi.dao;

import java.util.List;

import com.yangjiaqi.entity.Article;

public interface ArticleMapper {

	/**
	 * ��ȡ��������
	 * @param i ��ȡ�ĸ���
	 * @return
	 */
	List<Article> newList(int i);

	/**
	 * ��ȡ��������
	 * @return
	 */
	List<Article> hostList();

}
