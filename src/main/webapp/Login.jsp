<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    
    %>
<!DOCTYPE html>

<html>

<head>

	 <link rel="stylesheet" type="text/css" href="style.css">
	 
	<style>
	
	a:visited {
  color: red;
  
   display: inline-block;
  
}

li
{
  display:inline-block;
}
	</style>
	
 
  
	
</head>
<body>



<div id="navbar"> 
<form class="form" style="display:inline;" action="reg" method="get">
	
	<a href="reg" style="font-size: 40px ">Register</a>
	</form>
	
	<form class="form" action="ul"  style="display:inline; text-align: right;" method="get">
	<p><a href="ul" style="font-size: 40px ">profile</a></p>
	</form>
	</div>


	<h1 class="h1">Log in</h1>
	<input type="hidden" name="sessionId" value="12345">
	<div class="shell">
	
		<form class="form" action="log" method="POST">
		
				
				<p>Enter username</p>
		<input class="input" type="text" name="user" placeholder="Name">
				<p>Password:</p>
		<input class="input" type="password" name="pass" placeholder="Password"><br>
				
		
	
		<input type="Submit" value="Enter" class="button">
	</form>
	</div>
</body>
</html>