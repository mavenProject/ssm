package cn.springmvc.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.springmvc.model.SysPerson;
import cn.springmvc.service.SysPersonService;

@Controller
@RequestMapping("/welcome.do")
public class ParameterTypeController {

	public ParameterTypeController() {
	}

	@RequestMapping(params = "method=test1")
	public String test1(@RequestParam("name1") String name,
			@RequestParam("author1") String author) {
		System.out.println("name1 : " + name + ", author1 : " + author);
		// spnservice.countByExample( new Criteria());
		return "welcome";
	}

	@RequestMapping(params = "method=test2")
	public String test2(String name2, String author2) {
		System.out.println("name2 : " + name2 + ", author2 : " + author2);
		// spnservice.countByExample( new Criteria());
		return "welcome";
	}

	@RequestMapping(params = "method=test3")
	public String test3(HttpServletRequest request) {
		String name3 = request.getParameter("name3") == null ? "0" : request
				.getParameter("name3");
		String author3 = request.getParameter("author3") == null ? "0"
				: request.getParameter("author3");
		System.out.println("name3 : " + name3 + ", author3 : " + author3);
		// spnservice.countByExample( new Criteria());
		return "welcome";
	}

	@RequestMapping(params = "method=test4")
	public String test3(SysPerson sysperson) {

		System.out.println("name : " + sysperson.getName() + ", sex : "
				+ sysperson.getSex());
		// spnservice.countByExample( new Criteria());
		return "welcome";
	}

	/**
	 * ----------------------------------------------------分割线------------------
	 * ------------------------------------------
	 */
	// 使用ModelAndView对象
	@RequestMapping(params = "method=testToJsp1")
	public ModelAndView login(String name, String sex) {
		SysPerson sysperson = new SysPerson();
		sysperson.setName(name);
		sysperson.setSex(sex);
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("sysperson", sysperson);
		return new ModelAndView("welcome", data);
	}

	// 使用ModelAndView对象
	@RequestMapping(params = "method=testToJsp2")
	public String login(String name, String sex, ModelMap model) {
		SysPerson sysperson = new SysPerson();
		sysperson.setName(name);
		sysperson.setSex(sex);
		model.addAttribute("sysperson",sysperson);  
	    model.put("sex",sex);
		return "welcome";
	}
	
	// 使用@ModelAttribute
	@RequestMapping(params = "method=testToJsp3")
	public String login(@ModelAttribute("sysperson") SysPerson sysperson) {
		
		return "welcome";
	}
	
	// 使用ModelAndView对象
	@RequestMapping(params = "method=testToJsp4")
	public String login(String name,String sex ,ModelMap model,HttpServletRequest request) {
		SysPerson sysperson = new SysPerson();
		sysperson.setName(name);
		sysperson.setSex(sex);
		HttpSession session = request.getSession();  
	     session.setAttribute("sysperson",sysperson);  
	     model.addAttribute("model",sysperson);  
		return "welcome";
	}
	

}
