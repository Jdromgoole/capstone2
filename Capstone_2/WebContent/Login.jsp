<%@ include file="navbar.jsp"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

	<!-- Communicates with the Servlet -->

<form action="/Capstone_2/login" method="post">


		<div class="form-group">

			<label for="email">Email address:</label> 
			<input  name="emailAddress"  type="emailAddress"
				class="form-control" id="email">
		</div>
		<div class="form-group">
			<label for="password">Password:</label> 
			<input name="password" type="password"
				class="form-control" id="password">
		</div>
		<button type="submit" value="Login" class="btn btn-default">Submit</button>
	</form>


</body>

</html>