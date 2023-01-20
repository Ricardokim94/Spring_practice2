<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex04</title>
<style>
	table{
		text-align: center;
	}
</style>

</head>
<body>
	<h1>ex04 페이지 입니다.</h1>
	<table border="1">
		<tr>
			<th>이름 </th>
			<th>나이 </th>
		</tr>
		<tr>
			<td><c:out value="${dto.name }" /></td>		
			<td><c:out value="${dto.age }" /></td>		
		</tr>
	</table>
</body>
</html>