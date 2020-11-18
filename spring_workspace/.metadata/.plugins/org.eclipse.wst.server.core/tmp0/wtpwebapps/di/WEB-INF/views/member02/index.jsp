<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>get방식 전송</h3>
	<%-- result는 상대경로, /di_ex01/member02/result는 절대경로, 앞에 /붙으면 상대경로 port번호전까지--%>
	<form action="/di_ex01/member02/result" method="get">
		<input type="text" name="name"><br>
		<input type="text" name="age"><br>
		<input type="submit" value="전송"><br>
	</form>
	<h3>post방식 전송</h3>
	<form action="result" method="post">
		<input type="text" name="name"><br>
		<input type="text" name="age"><br>
		<input type="submit" value="전송"><br>
	</form>
</body>
</html>