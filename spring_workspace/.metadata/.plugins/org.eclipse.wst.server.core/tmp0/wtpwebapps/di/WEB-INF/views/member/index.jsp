<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	어렵다!!!!!!!!!<br>
	<h1>${ index } <%-- model 통해 넘어온 값... --%><br></h1>
	request : <%= request.getAttribute("index") %><br>
	<a href="login">로그인 페이지</a>
	<a href="logout">로그아웃 페이지</a>
</body>
</html>