<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>취미 추가 페이지</h1>
	<form action="/jsp19CustommerHobby/hobby/insertDB.hobby" method="get">
		ID : 
		<select name="id">
			<c:forEach items="${ids }" var="id">
				<option value="${id }">${id }
			</c:forEach>
		</select>
		<br>
		취미 : <input type='text' name='hobby'><br>
		<input type='submit' value=전송>
	</form>
</body>
</html>

