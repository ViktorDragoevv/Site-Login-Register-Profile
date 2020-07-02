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
  
}
	</style>
	
 
  
	
</head>
<body>
<form class="form" action="log" method="get">
	
	<a href="log" style="font-size: 40px ">Login</a>
	</form>

	<h1 class="h1">Create new Profile</h1>
	<div class="shell">
	
		<form class="form" action="reg" method="POST">
		
				
				<p>Enter name</p>
		<input class="input" type="text" name="name" placeholder="Name">
		<p>Username</p>
		<input class="input" type="text" name="username" placeholder="username">
				<p>Password:</p>
		<input class="input" type="password" name="password" placeholder="Password at least 8 characters"><br>
		<p>Confirm Password:</p>
		<input class="input" type="password" name="repeatpass" placeholder="Confirm Password"><br>
		
		
		
	
		<input type="Submit" value="Enter" class="button">
	</form>
	</div>
</body>
</html>