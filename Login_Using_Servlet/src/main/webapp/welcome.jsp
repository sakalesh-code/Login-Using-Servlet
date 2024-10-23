<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
	<%
	if (session.getAttribute("uname") == null) {
		response.sendRedirect("login.jsp");
	}
	%>
	welcome.. ${uname}
	<br>
	<a href="videos.jsp">click for videos</a><br><br>
	<form action="LogOut">
	<input type="submit" value="logout"></form>
</body>
</html>