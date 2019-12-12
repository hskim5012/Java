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
<body onload="time()">
	<h3><c:out value="${time}"/></h3>
</body>
</html>