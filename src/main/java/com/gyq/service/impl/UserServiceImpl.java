package com.gyq.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gyq.mapper.user.UserMapper;
import com.gyq.pojo.UserBean;
import com.gyq.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public boolean loginOK(UserBean user) {
		UserBean tuser=userMapper.getUserInfo(user.getUname());
		if(tuser.isNotNullOrEmpty()) {
			return tuser.getUname().equals(user.getUname())&&tuser.getPwd().equals(user.getPwd());
		}
		return false;
	}
	

}
