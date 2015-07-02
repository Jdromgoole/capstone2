<%@ include file="navbar.jsp"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Logout</title>
</head>
<body>

<form action="/Capstone_2/LogoutServlet" method="post">


Are you sure you want to logout?

<!-- post -logout.
need logout servlet
needs a doPost (request, response)
req.getSession.invalidate

*after a successful post, redirect not forward (loggedOut.jsp) 
-->

<button type="submit" value="logout" class="btn btn-default">Submit</button>


</form>

</body>
</html>