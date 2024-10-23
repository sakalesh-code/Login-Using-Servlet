<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Videos Page</title>
</head>
<body>
<%
	if (session.getAttribute("uname") == null) {
		response.sendRedirect("login.jsp");
	}
	%>
https://www.youtube.com/watch?v=cYc3FjhMMzI&list=PLsyeobzWxl7pUPF2xjjJiG4BKC9x_GY46&index=32
</body>
</html>