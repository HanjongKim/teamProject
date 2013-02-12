package com.testoauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class testOAuthController {

	@RequestMapping("/test")
	public ModelAndView searchViewInfo(){
		String sMessage = "I love Spring";

		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		return new ModelAndView("test","message",sMessage);
		
	}
}
