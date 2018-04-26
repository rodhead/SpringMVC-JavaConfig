package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("t1") int num1, @RequestParam("t2") int num2) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		ModelAndView mv=new ModelAndView();
		int k=num1+num2;
		mv.addObject("result", k);
		mv.setViewName("result.jsp");
		return mv;
		
	}

}
