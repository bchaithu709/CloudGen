package com.cloudgen.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentEnquiryController {
	
	
	@RequestMapping("/hello")
	public String sef() {
		return "student_enquiry_form.html";
	}

}
