package com.cg.springmvcone.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springmvcone.dto.ScheduledSessions;
import com.cg.springmvcone.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeservice;
	
	@RequestMapping(value="/showall",method=RequestMethod.GET)
   public ModelAndView showAllData(@ModelAttribute("aa") ScheduledSessions emp){
   List<ScheduledSessions> empList=employeeservice.showAllEmployee();		
	return new ModelAndView("show","sessiondata",empList);
	
}
	
	@RequestMapping(value="/update/{id}" )
	public ModelAndView getUpdateEmployee
	( @PathVariable("id") int id ,@ModelAttribute("up") ScheduledSessions scsession, Map<String,Object> model) {
		
		ScheduledSessions empOne=employeeservice.searchEmployee(id);	
		
		List<String> myQul=new ArrayList<String>();
		myQul.add("BSC");
		myQul.add("MCA");
		myQul.add("BE");
		myQul.add("ME");
		model.put("myq",myQul);
		
		return new ModelAndView("update","modelupdate",empOne);
		
	}
	
	@RequestMapping(value="/updateemployee",method=RequestMethod.POST)
	public String updateEmployeeDataBase(
			@Valid@ModelAttribute("up") ScheduledSessions emp,
			BindingResult result
			,Map<String,Object> model
			){
		System.out.println(emp.getFaculty());

		if(result.hasErrors()){
			List<String> myQul=new ArrayList<String>();
			myQul.add("BSC");
			myQul.add("MCA");
			myQul.add("BE");
			myQul.add("ME");
			model.put("myq",myQul);
			return "update";
		}
		
		employeeservice.updateEmployee(emp);
		return "redirect:/showall";
		
	}
	
}
