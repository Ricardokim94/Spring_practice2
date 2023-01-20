package com.example.ex02.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") //파일을 참조해서 단위테스트 돌아갈수 있게 한는 것
@Log4j
public class Jdbc_Tests {
	
	static { //메모리에 일단 올려놓음 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","kim","cm~!27232723")){
			log.info(connection);
		}catch(Exception e) {
			//Junit의 메세지로서 무조건 실패로 처리한 뒤 실행을 중지한다.
			fail(e.getMessage());
		}
	}

}
