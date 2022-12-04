package com.krishna;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.krishna.model.Employee;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Home Page Requested...");
		return "addEmployee";
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
	
	//Model
	//ModelMap
	
//	@RequestMOapping("add")
//	 public ModelAndView add(@RequestParam("num1") int i,@RequestParam("num2") int j,HttpSession session) {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("results");
//		int sum=i+j;
//		mv.addObject("num3",sum);
//		
//		return mv;
//	}
	
	
	@RequestMapping("add")
	 public String add(@RequestParam("num1") int i,@RequestParam("num2") int j,ModelMap mp) {
		int sum=i+j;
		mp.put("num3",sum);
		return "results";
	}
	
//	@RequestMapping("/addEmployee")
//	 public String addEmployee(@RequestParam("empNo") String empNo,@RequestParam("empName") String empName,ModelMap mp) {
//		Employee obj = new Employee();
//		obj.setEmpNo(empNo);
//		obj.setEmpName(empName);
//		mp.put("employee",obj.toString());
//		return "employeeResults";
//	}
	@ModelAttribute
	public void setModelData(Model m) {
		m.addAttribute("name","Sujith");
	}
	
	@RequestMapping("/addEmployee")
	 public String addEmployee(@ModelAttribute("a1") Employee emp) {
		return "employeeResults";
	}
	
	
}
