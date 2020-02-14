<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>main페이지 입니다.</h1>
	<c:if test="${!empty id}">
		<h3>${id}님 방문을 환영합니다.</h3>	
		<a href="logout.do">로그아웃</a>
	</c:if>
	<c:if test="${empty id}">
   		<a href="login.do">로그인</a>
		<a href="join.do">회원가입</a>
	</c:if>
</body>
</html>