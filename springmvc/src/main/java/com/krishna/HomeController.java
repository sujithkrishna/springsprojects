package com.krishna;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.krishna.model.Employee;

public class HomeController {

	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Home Page Requested...");
		return "addEmployee";
	}
	
	
	@RequestMapping("add")
	 public String add(@RequestParam("num1") int i,@RequestParam("num2") int j,ModelMap mp) {
		int sum=i+j;
		mp.put("num3",sum);
		return "results";
	}
	

	@ModelAttribute
	public void setModelData(Model m) {
		m.addAttribute("name","Sujith");
	}
	
	@RequestMapping("/addEmployee")
	 public String addEmployee(@ModelAttribute("a1") Employee emp) {
		return "employeeResults";
	}
}
