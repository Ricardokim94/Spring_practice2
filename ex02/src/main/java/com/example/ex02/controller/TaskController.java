package com.example.ex02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TaskController {
//아이디와 비밀번호를 입력받은 후 아이디가 admin일 경우 admin.html로 이동 
//아이디가 user 일 경우 user.jsp로 이동 
	
	//-amdin.jsp
	//user.jsp
			
//id와 pw를 입력할 수 있는 화면이 필요! + 화면으로 이동 할 수있는 method 필요!
	@GetMapping("/loginForm")
	public String goLoginForm() {
		return "task/task01/login";
	}
	
	//버튼을 누르면 넘어가는 페이지 
	@PostMapping("/login")
	//외부에서 전달받은 id와 pw를 매개변수로 받는다.
	public String login(@ModelAttribute("id") String id , String pw) { //@ModelAttribute : 전달할페이지 에다가 id란 값을 전달한다.
		//만약 id 가 admin일 경우 admin.jsp로 이동 시킨다.
		if(id.equals("admin")) {
			return "task/task01/admin";
		}
		//만약 id가 admin아닐 경우 user.jsp로 넘어가라  
		return "task/task01/user";
	}
	
}
