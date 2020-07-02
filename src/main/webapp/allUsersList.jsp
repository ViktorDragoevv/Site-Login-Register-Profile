<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="model.User" %>
      <%@ page import="model.UserRepository" 
      import="java.util.HashSet"
    
      
      %>
    
<!DOCTYPE html>
<html>
<head>
	<title></title>
	  <link rel="stylesheet" type="text/css" href="cs.css">
	 <style>



 

	 
</style>	 
	 
</head>
<body>

<header class="header">




<div style="float: left;width: 300px;"><form class="form"  action="log" method="get">

<input class="ybtn" type="Submit"  value="Vhod" >
</form></div>
<div style=";float: right;"><form class="form"  action="reg" method="get">
<input class="ybtn" type="Submit"  value="Registraciq" >
</form></div>
<div style=";float: none;overflow: hidden;"><form class="form"  action="ul" method="get">
<input class="ybtn" type="Submit"  value="Potrebiteli" >
</form></div>






</header>
<main class="main">
<div class="shell">





<table>
<tr>
  <th>potrebitel</th>
  <th>rabota</th>
  <th>informaciq</th>
</tr>


<%

HashSet<User>  u = UserRepository.getInstance().getH();

for (User us : u) 
	
{
	
	
	%>
	




 <tr>
  <td><u><a href="Profile?UID=<%=us.getsID()%>"><%out.print(us.getUserName());%></a></u></td>
   <td><%out.print(us.getUserJob());%></td>
   <td><%out.print(us.getUserDescription());%></td>
 </tr>
 

<%} %>
</table>
</div>
</main>


</body>
</html>