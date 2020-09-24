<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Results</title>
</head>
<body>
	<h1>Results!</h1>
	<p>
	${madlibInstance.constructMadLib()}
	</p>
	<p>
	<a href="index.jsp">Create a different Mad Lib</a>
	</p>
	
	<form action="thankYouServlet" method="post">
	How many stars would you rate this program?
	<input type="text" name="rating">
	<input type="submit" value="Submit"/>
	</form>
</body>
</html>