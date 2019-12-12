<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
 
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/app.js"></script>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body onload="date()">
	<h2><c:out value="${date}"/></h2>
</body>
</html>