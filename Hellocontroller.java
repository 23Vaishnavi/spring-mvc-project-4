package com.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Hellocontroller {
	@RequestMapping("hello")
	public ModelAndView hello() {
		ModelAndView view=new ModelAndView("hellopage");
		view.addObject("welcome","third springmvc application");
		return view;
	}

}
