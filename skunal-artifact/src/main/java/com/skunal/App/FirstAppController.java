package com.skunal.App;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class FirstAppController {

	
	@RequestMapping(value = "/print")
	public static String PrintFirstValue() {
		return "hello Kunal This is the first app";
	} 
	
	
	@RequestMapping("/page")
	public ModelAndView index () {
		ModelAndView mv  = new ModelAndView();
		
		 mv.setViewName("index");
		 
		  return mv;
	}
	
	
	
}
