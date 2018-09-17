package com.hiatus.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Webcontroller {
	
	@RequestMapping(value= {"/","login","index"})
	public String hello() {
		return "login";
	}
	
	@RequestMapping(value= {"create-new-record"})
	public String createNewRecord() {
		return "create-new-record";
	}
	
	@RequestMapping(value= {"create-new-user"})
	public String createNewUser() {
		return "create-new-user";
	}
	
	@RequestMapping(value= {"view-case-details"})
	public String viewCaseDetails() {
		return "view-case-details";
	}
	
	@RequestMapping(value= {"dashboard"})
	public String viewDashboard() {
		return "dashboard";
	}
	
	@RequestMapping(value= {"add-visit.templ.html"})
	public String addvisit() {
		return "add-visit.templ";
	}
	
}
