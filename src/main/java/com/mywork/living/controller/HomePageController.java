package com.mywork.living.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public class HomePageController {

	@RequestMapping("/index")
	public String getHomePage(){
		return "";
	}
}
