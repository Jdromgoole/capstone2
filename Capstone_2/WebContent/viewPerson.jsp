<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>  
           
           
<%@ include file="navbar.jsp"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>People List</title>
</head>
<body>

	
	
<h2>${capName } Detail Page</h2>
<hr/>
	${user.ID } <br/>
	${user.name } <br/>
	${user.email } <br/>
	<br/>
	<a href="${pageContext.request.contextPath}/index.jsp">Home</a> <br/>
	<a href="${pageContext.request.contextPath}/listpeople">People List</a>


</body>
</html>