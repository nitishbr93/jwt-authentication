package com.jwt.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
//@CrossOrigin
@CrossOrigin(origins = "*")
public class Home {
	@RequestMapping("/welcome")
	public String welcome() {
system.out.println("this is home page");
		String text="this is private page";
		text+="this page is not allowed to anauthentical users";
		return text;
	}
	


}
