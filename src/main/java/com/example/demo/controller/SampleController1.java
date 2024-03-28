package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


// get방식
@Controller
public class SampleController1 {

	@GetMapping("/user/userinfo")
	public String userInfo() {
		return "/user/userinfo";
	}
	
	@GetMapping("/user/userdata")
	public String userData( Model model ) {
		model.addAttribute("username", "최민석");
		
		return "/user/userinfo";
	}
	
	@GetMapping("/user/userid")
	public String userId( @RequestParam( value="userid", required=false ) String userid, Model model ) {
		model.addAttribute("userid", userid);
		
//		required의 기본값은 true => 별도의 파라미터를 지정해 주지 않으면 에러가 발생
//		ex) http://localhost:8080/user/userid?userid=minseok
//		기본 형태: @RequestParam("userid")
		return "/user/userinfo";
	}
	
	@GetMapping("/user/userparams")
	public String userParams(
			@RequestParam( value="userid", required=false ) String userid, 
			@RequestParam( value="username", required=false ) String username, 
			@RequestParam( value="useremail", required=false ) String useremail,
			Model model ) {
		
		model.addAttribute("userid", userid);
		model.addAttribute("username", username);
		model.addAttribute("useremail", useremail);
		
		return "/user/userinfo";
	}
}
