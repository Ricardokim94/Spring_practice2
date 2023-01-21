package com.example.ex02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TaskController {
//아이디와 비밀번호를 입력받은 후 아이디가 admin일 경우 admin.html로 이동 
//아이디가 user 일 경우 user.html로 이동 
	
	//-amdin.html
	//user.html
			
//id와 pw를 입력할 수 있는 화면이 필요! + 화면으로 이동 할 수있는 method 필요!
	@GetMapping("/loginForm")
	public String goLoginForm() {
		return "task/task01/login";
	}
	
	@PostMapping("/login")
	public String login(String id , String pw) {
		//admin이 아니면 싹다 가라!
		if(id.equals("user")) {
			return;
		}
	}
	
}
