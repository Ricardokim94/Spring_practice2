package com.example.ex02.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

//
//Mapper interface
// - SQL를 작성하는 작업은 XML을 이용할 수도 있지만, 최소한의 코드를 작성하기 위해서는 
// 		Mapper interface를 사용한다. 

@Mapper
public interface TimeMapper {
//	@Select("select now() from dual")
//	public String getTime();
//	
	public String getTime2();
}
