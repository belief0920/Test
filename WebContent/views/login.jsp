<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>login 페이지입니다.</h1>
	<form action="login.do" method="post">
		<div>
			<span>아이디 : </span><input type="text" name="id" />
		</div>
		<div>
			<span>비밀번호 : </span><input type="password" name="pwd"  />
		</div>
		<div>
			<input type="submit" value="로그인" /> <input type="button" value="취소" />
		</div>
	</form>
</body>
</html>