<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">




<title>Select Category</title>

</head>
<body>



	<c:import url="/loggedNavbar.jsp"></c:import>
	<%@ include file="Header.jsp"%>

	<br>
	<br>
	<br>
	<center>
		<h1>Pick a category</h1>
	</center>
	<br>
	<br>
	<br>




	<div class="row">
		<div class="col-xs-6 col-md-4">
			<a href="instrumentGuitar.jsp" class="thumbnail"> <img
				src="Images/GuitarTab.jpg" alt="guitar">
			</a>
		</div>

	
	
	
		<div class="col-xs-6 col-md-4">
			<a href="instrumentBass.jsp" class="thumbnail"> <img
				src="Images/Bass Guitar.jpg" alt="bass">
			</a>
		</div>

	
	
	
		<div class="col-xs-6 col-md-4">
			<a href="instrumentDrums.jsp" class="thumbnail"> <img
				src="Images/Drums.jpg" alt="drums">
			</a>
		</div>

	
	
	
		<div class="col-xs-6 col-md-4">
			<a href="instrumentVocals.jsp" class="thumbnail"> <img
				src="Images/MicroPhone.jpg" alt="vocals">
			</a>
		</div>

	
	</div>
</body>
</html>