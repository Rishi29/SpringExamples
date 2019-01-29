package com.chipmunk.springform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.chipmunk.springform.model.Student;

@Controller
public class StudentController {
	
	@RequestMapping(value="/student",method=RequestMethod.GET)
	public ModelAndView studentInfo() {
		return new ModelAndView("student", "command", new Student());
	}
	
	@RequestMapping(value="/addStudent",method=RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringWeb")Student student, ModelMap model){
		
		model.addAttribute("name",student.getName());
		return "studentInfo";
	} 
	

}
