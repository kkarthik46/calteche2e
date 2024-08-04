package com.caltech.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DemoController {
@ResponseBody
	@RequestMapping("/")
	public String requestMethodName() {
		return "Hi Caltech Learners!";
	}
	
	
	
}
