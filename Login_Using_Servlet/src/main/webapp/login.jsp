<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<form action="Login" method="post">
		UserName :<input type="text" name="user"> <br>
		password :<input type="password" name="pass"> <br>
		<input type="submit">
	</form>
	<%
	response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate"); // Prevent caching
	response.setHeader("Pragma", "no-cache"); // For older HTTP/1.0 clients
	response.setHeader("Expires", "0"); // Expiration date in the past
	%>
</body>
</html>