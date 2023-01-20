<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EX07</title>
</head>
<body>
	<c:set var="total" value="${studentVo.kor + studentVo.eng + studentVo.math}"/>
	<c:set var="avg" value="${total /3}"/>
	<table border="1">
		<tr>
			<th>번호</th>	 
			<th>국어</th>	
			<th>영어</th>	
			<th>수학</th>	
			<th>총점</th>	
			<th>평균</th>	
		</tr>
		<tr>
			<td><c:out value="${studentVo.num}"/></td>	
			<td><c:out value="${studentVo.kor}"/></td>	
			<td><c:out value="${studentVo.eng}"/></td>	
			<td><c:out value="${studentVo.math}"/></td>	
			<td><c:out value="${total}점"/></td>	
			<td><c:out value="${avg}점"/></td>	
		</tr>
	</table>
</body>
</html>