<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<c:import url="/navbar.jsp"></c:import>

    <h4>Musicians</h4>
	<table class="table table-striped table-bordered table-hover table-condensed">
		<!--  <thread><td>Name</td><td>Email</td>
		</thread>	 -->
		
		<!-- The table header row -->
		<tr>
			<th>Name</th>
			<th>Age</th>
			<th>Location</th>
			<th>Instrument</th>
			<th>Experience</th>
			
			<!--  <th>Detail Link</th> -->
		</tr>	
		<!-- Table data rows -->
		
		<c:forEach items="${musicians }" var="musicians">
			<tr>
				<!-- Rest of tr tag data items -->
		    	<td>${musician.name}</td>
				<td>${musican.age}</td>
				<td>${musician.location}</td>
				<td>${musician.instrument}</td>
				<td>${musician.experience}</td>
				<td>

					<a class="btn btn-default btn-xs" href="editMusician?id=${musician.id }">Edit</a>
					<form class="form-horizontal"  action="deleteVehicle" method="post">
						<input type="hidden" name="id" value="${musician.id }">
						<input class="btn btn-xs btn-danger"  type="submit" value="Delete" id="submit">
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>
	
	<!--  <a class="btn btn-primary" href="/SmallSecureWebsite/addVehicle">Add Vehicle</a> -->


</body>
</html>