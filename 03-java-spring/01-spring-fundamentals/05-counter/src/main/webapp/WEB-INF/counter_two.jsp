<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<div class="revisit">
		<fieldset>
		<legend>Times Visited</legend>
		<p>You visited this site ${count} times.</p>
		<a href="/your_server">Go Back</a> 
	</fieldset>
</div>
</body>
</html>