package com.example.studentlist.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
//@ResponseBody
public class StudentController
{	
	@RequestMapping("/hello")
	public String home()
	{
		return "list";
	}
}
