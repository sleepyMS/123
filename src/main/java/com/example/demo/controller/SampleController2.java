package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


// post방식
@Controller
public class SampleController2 {
	
//	통째로 넘어가는 방식
//	@PostMapping("/post")
//	public String demoPost( @RequestBody String req, Model model ) {
//		
//		model.addAttribute("req", req);
//
////		System.out.println("성공");
////		System.out.println(req);
//		
//		return "post/post";
//	}
	
//	각각의 값을 따로 받음
	@PostMapping("/post")
	public String demoPost( 
			@RequestParam( value="membername", required=false ) String membername,
			@RequestParam( value="memberid", required=false ) String memberid, 
			Model model ) {
	    
	    model.addAttribute("membername", membername);
	    model.addAttribute("memberid", memberid);

	    return "post/post";
	}
}
