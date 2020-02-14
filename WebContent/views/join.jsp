<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>join 페이지입니다.</h1>
	<div class="container">
	<form action="join.do" method="POST">
		<div>
			<span>아이디 : </span><input type="text" name="id" />
		</div>
		<div>
			<span>비밀번호 : </span><input type="password" name="pwd" />
		</div>
		<div>
			<span>비밀번호 확인 :</span><input type="password" name="" />
		</div>
		<div>
			<span>이메일 : </span><input type="text" name="email"  />
		</div>
		<div>
			<span>주소 : </span><input type="text" name="addrs"  />
		</div>
		<div>
			<input type="submit" value="회원가입" />
			<input type="button" value="취     소" />
		</div>
	</form>
	</div>
</body>
</html>