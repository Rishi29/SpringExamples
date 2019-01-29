<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>

	<P>Student Information</p>

	<form action="addStudent" method="post">
		<input type="text" name="name"><br> <input
			type="submit" value="submit">
	</form>
</body>
</html>