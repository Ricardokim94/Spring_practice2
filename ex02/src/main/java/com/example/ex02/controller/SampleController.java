package com.example.ex02.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.ex02.domain.vo.InfoDTO;
import com.example.ex02.domain.vo.StudentVO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/ex/*")
@Log4j
public class SampleController {
	@RequestMapping(value= "/basic", method = {RequestMethod.GET, RequestMethod.POST})
	public void basic(HttpServletRequest req) {
		log.info("basic...." +req.getMethod());
	}
	
	@RequestMapping
	public void basic2() {
		log.info("basic2......");
	}
	
	@GetMapping("/basicOnlyGet")
	public void basic3() {
		log.info("basic3.....");
	}
	
	//외부에서 전달된 파라미터를 매개변수 필드명과 자동으로 맵핑한다. 받는 법  (객체를 만들어서 객체로받아라 )
	@GetMapping("/ex01")
	public void ex01(InfoDTO infoDTO) {
		log.info("ex01...." + infoDTO.getName() + "," + infoDTO.getAge());
	}
	
	//필드이름과 매개변수(DTO) 다를때!
	@GetMapping("ex02")
	public void ex02(@RequestParam("data1")String name, @RequestParam("data2")int age) {
		log.info("ex02......." + name +"," + age);
	}
	
	//게시글에서 여러개 받을때 이럴때 ArrayList를 쓴다.
	@GetMapping("/ex03")
	public String ex03(@RequestParam("data") ArrayList<String> datas) {
		log.info("datas : " +datas);
		return "ex03";
	}
	
	
	//이제 화면으로 전달까지 해보자!
	//ModelAttribute는 화면에서 쓸 key값이라고 생각 하면된다. 
	@GetMapping("/ex04")
	public String ex04(@ModelAttribute("dto") InfoDTO infoDTO) {
		log.info("----------");
		log.info("ex04......."); 
		log.info(infoDTO.toString());
		log.info("----------");
		
		return "ex04";
	}
	
	//두개를 받을거다!
	@GetMapping("/ex05")
	public void ex05(InfoDTO infoDTO, @ModelAttribute("gender") String gender) {
		log.info("ex05......");
		log.info(infoDTO.toString());
		log.info("gender" + gender);
	}
	
	@GetMapping("ex06")
	//Model 객체는 파라미터로 request객체를 받는다.
	//따라서 여러개의 데이터를 화면에 전달할 때 
	//addAttribute(KEY, VALUE)을 사용한다. 
	//화면에서는 model에 설정한 KEY로 VALUE를 사용할 수 있다.
	
	public String ex06(InfoDTO infoDTO, String gender, Model model) {
		log.info("ex06......");
		log.info(infoDTO.toString());
		log.info("gender" + gender);
		
		model.addAttribute("dto", infoDTO);
		model.addAttribute("gender", gender);
		
		return "ex/ex06";
	}
	
	@GetMapping("/ex07") 
//외부에서 학생의 번호, 국어, 영어, 수학 점수를 모델객체로 전달 받는다.
//파라미터명과 매개변수에 선언된 모델객체의 필드명이 동일하면 자동으로 매핑된다.
//리턴시 알맞는 페이지로 이동이 되고 , 모델객체는 직접 KEY를 지정하지 않아도
//화면쪽에서는 앞글자만 소문자 바뀐 값으로 해당 필드를 접근할수 있다. 
	public String ex07(StudentVO studentVo) {
		log.info("ex07......");
		log.info(studentVo.toString());
		return "ex/ex07";
	}
}














