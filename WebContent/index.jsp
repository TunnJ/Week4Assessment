<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MadLibs Game</title>
</head>
<body>
	<h1>MadLibs Game!</h1>
	
	<form action="getMadLibServlet" method="post">
	Enter a person's name:
	<input type="text" name="personName" size="10">
	<br>
	Enter a present tense verb:
	<input type="text" name="verb" size="10">
	<br>
	Enter an adverb:
	<input type="text" name="adverb" size="10">
	<br>
	Enter a adjective to describe someone:
	<input type="text" name="adjective" size="10">
	<br>
	<input type="submit" value="Calculate MadLib"/>
	
	
	</form>
</body>
</html>