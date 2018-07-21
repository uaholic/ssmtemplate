package com.gyq.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.gyq.pojo.UserBean;
import com.gyq.service.UserService;


@Controller
public class UserController {
	@Autowired
	@Qualifier("userService")
	private UserService userService;

    @RequestMapping(value = "/loginAction",method = RequestMethod.POST)
    public ModelAndView loginAction(UserBean user,HttpSession session) {
    	ModelAndView mav=new ModelAndView("userinfo");
    	String info="登录失败";
    	if(user.isNotNullOrEmpty()&&userService.loginOK(user)) {
    		info="登录成功";
    		session.setAttribute("user", user);
    	}
    	mav.addObject("info", info);
    	return mav;
    }
    

}
