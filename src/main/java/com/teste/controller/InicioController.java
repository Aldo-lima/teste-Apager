package com.teste.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InicioController {

	
	
	   @RequestMapping("/home")
	    public ModelAndView home() {
	    	ModelAndView mv = new ModelAndView("teste");
	    	    	return mv;
	   }
}
