package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


// 스프링부트 OTO객체 전달 - Form과 View를 templates 폴더에서 처리
@Controller
public class SampleController4 {

    @GetMapping("/SampleController4Form")
    public String mainPage() {

        return "/post/SampleController4Form";
    }

    @PostMapping("/SampleController4View")
    public String userForm(
            UserDTO userDTO,
            Model model) {

        // userDTO객체를 통한 출력
        System.out.println(userDTO.getUserName());
        System.out.println(userDTO.getUserId());
        System.out.println(userDTO.getUserPhone());

        model.addAttribute("header", "스프링부트 DTO객체 전달");


        return "/post/SampleController4View";
    }
}
