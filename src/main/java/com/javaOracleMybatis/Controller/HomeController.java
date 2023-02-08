package com.javaOracleMybatis.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/form")
public class HomeController {
	
	@GetMapping("/main")
	public String viewMain() {
		return "home/main";
	}
	
	@GetMapping("/table/user")
	public String viewTableUser() {
		return "home/tableUser";
	}
	
	@GetMapping("/table/userDetail")
	public String viewTableUserDetail(@RequestParam("UserId") int userId) {
		return "home/userDetail";
	}
	/*
	 * 
	 * 
	 * Branch 05
	 * 
	 * 
	 * */
}
