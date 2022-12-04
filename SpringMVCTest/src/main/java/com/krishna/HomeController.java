package com.krishna;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		System.out.println("Home Page Requested...");
		return "index";
	}
	
	// Initial Way of Doing -- Way1
	//	@RequestMapping("add")
	//	public String add(HttpServletRequest request) {
	//		int no1 = Integer.parseInt(request.getParameter("num1"));
	//		int no2 = Integer.parseInt(request.getParameter("num2"));
	//		System.out.println(no1+no2);
	//		return "results.jsp";
	//	}

	
	
	
	// Initial Way of Doing -- Way2
//	@RequestMapping("add")
//	 public String add(@RequestParam("num1") int i,@RequestParam("num2") int j,HttpSession session) {
//		int sum=i+j;
//		System.out.println(sum);
//		session.setAttribute("num3", sum);
//		return "results.jsp";
//	}
	
	
	@RequestMapping("add")
	 public ModelAndView add(@RequestParam("num1") int i,@RequestParam("num2") int j,HttpSession session) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("results");
		int sum=i+j;
		mv.addObject("num3",sum);
		
		return mv;
	}
	
}
