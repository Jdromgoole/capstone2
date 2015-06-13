<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>  

<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

<meta charset="UTF-8">
 

<title>Navigation Bar</title>
</head>
<body>

<nav class="navbar navbar-inverse cols=40>
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
     
      <!-- Link "Brand" with index.jsp -->
     
      <a class="navbar-brand" href="index.jsp">TMP</a>
    </div> 

      <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
      

        
        <li><a href="Login.jsp">Login</a></li>
        <li><a href="About.jsp">About Us</a></li>
        <li><a href="Board.jsp">Message Board</a></li>
        
        <li>
        <form class="navbar-form navbar-right" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="What're you looking for?">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
      </form>
        </li>
        
    
      </ul>
      </div>
      
</nav>
</body>
</html>