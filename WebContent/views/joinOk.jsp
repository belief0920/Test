<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function () {
		console.log("test");
		var second = 5;
		var timer = document.getElementById("timer");
		
		setTimeout(() => {
			location.href = "main.do";
			
		}, 6000);
		
		setInterval(() => {
			timer.innerHTML = second+"초 뒤에 이동합니다.";
			second--;
		}, 1000);
		
	}
</script>
</head>
<body>
	<h1>${dto.id}님 회원가입을 축하합니다.</h1>
		<div>
			<span>아이디 : </span><input type="text" name="id" value="${dto.id}"/>
		</div>
		<div>
			<span>이메일 : </span><input type="text" name="email" value="${dto.email}" />
		</div>
		<div>
			<span>주소 : </span><input type="text" name="adds" value="${dto.addrs}"/>
		</div>
		<div id="timer">
		
		</div>
</body>
</html>