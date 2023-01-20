package com.example.ex02.domain.vo;

import org.springframework.stereotype.Component;

import lombok.Data;
//DB연동 연습 
@Component 	//스프링에 등록 
@Data
public class InfoDTO {
	private String name;
	private int age;
}
