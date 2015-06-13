<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>  





<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">


<title>Message Board</title>
</head>
<body>

<%@ include file="navbar.jsp" %>




<form class="form-vertical container">
<form method='post'>

<div class="form-group">
<div class=col-sm-6-col-lg-3>
<textarea rows="4" cols="50">
</textarea>
</div>
</div>

  <div class="form-group">
  <div class="col-sm-6-col-lg-2">
    <label for="userFirstName">First Name</label>
    <input type="firstName" class="form-control" id="userFirstName" placeholder="First Name">
  </div>
  </div>
  
  <div class="form-group">
  <div class="col-sm-6-col-lg-2">
    <label for="userLastName">Last Name</label>
    <input type="lastName" class="form-control" id="userLastName" placeholder="Last Name">
  </div>
  </div>
  
<div class="form-group">
 <div class="col-sm-6-col-lg-2">
    <label for="userEmail">Email</label>
    <input type="userEmail" class="form-control" id="userEmail" placeholder="Email">
  </div>
  </div>
  
<div class="col-sm-6-col-lg-3">
  <button type="submit" class="btn btn-default">Post</button>
  </div>
</form>
   
</form>
  

  




</body>
</html>