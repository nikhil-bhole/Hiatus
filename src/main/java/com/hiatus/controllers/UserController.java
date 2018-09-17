package com.hiatus.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.hiatus.entities.Users;
import com.hiatus.services.UsersService;


@RestController
@Controller
public class UserController {
	 
	private UsersService usersService;
	
	@Autowired
	public void setUsersService(UsersService usersService) {
	        this.usersService = usersService;
	}
	
	@RequestMapping(value = "saveuser", method = RequestMethod.POST)
	public String saveProduct(Users user) {
	      usersService.save(user);
	        return "login";
	}
}
