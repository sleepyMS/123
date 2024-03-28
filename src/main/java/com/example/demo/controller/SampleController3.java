package com.example.demo.controller;


import com.example.demo.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


//스프링부트 객체 전달 (userDTO 객체 사용)
@Controller
public class SampleController3 {
//    @PostMapping("/SampleController3")
//    public String userForm(
//            @RequestParam( value="userName", required=false ) String userName,
//            @RequestParam( value="userId", required=false ) String userId,
//            @RequestParam( value="userPhone", required=false ) String userPhone,
//            Model model) {
//        // 기존 방식
//        model.addAttribute("userId", userId);
//        System.out.println(userId);
//
//        return "/post/SampleController3View";
//    }

    @PostMapping("/SampleController3")
    public String userForm(
            UserDTO userDTO,
            Model model) {

        // 객체를 이용한 출력
        System.out.println(userDTO.getUserName());
        System.out.println(userDTO.getUserId());
        System.out.println(userDTO.getUserPhone());

        model.addAttribute("header", "스프링부트 DTO객체 전달");

//        아래처럼 넘기지 않아도, 값이 전달됨
//        model.addAttribute("userName", userDTO.getUserName());
//        model.addAttribute("userId", userDTO.getUserId());
//        model.addAttribute("userPhone", userDTO.getUserPhone());

        return "/post/SampleController3View";
    }
}
