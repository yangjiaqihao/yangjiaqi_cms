package com.yangjiaqi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangjiaqi.dao.ChannelMapper;
import com.yangjiaqi.entity.Channel;
import com.yangjiaqi.service.ChannelService;

/**
 * 
 *
 */

@Service
public class ChannelServiceImpl  implements ChannelService{
	
	@Autowired
	ChannelMapper channelMapper;

	public List<Channel> list() {
		// TODO Auto-generated method stub
		return channelMapper.list();
	}

}
