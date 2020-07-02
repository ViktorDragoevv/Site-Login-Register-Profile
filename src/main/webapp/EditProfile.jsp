<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.User" %>
     <%User us =(User)request.getAttribute("User"); %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css.css">
<script src="editProfileSet.js"></script>

</head>
<body>
<jsp:useBean id = "User" class = "model.User" scope="session"> 
         <jsp:setProperty name = "User" property = "*" />
          </jsp:useBean>
	
	
					
	<header class="header">
	<form class="form"  action="log" method="get">
<input class="ybtn" type="Submit"  value="Profil" >
</form>
	</header>
	
	<main class="main">
	
	
		<div class="shell">
			<div class="userProf">
				<img class="image" src="user.jpg" />

				<div class="ProfInfo">
					<h2 class="heading">Profile Information</h2>
					
					
					
		
					<form    class="firstBlock"  method="POST">
					
					
					<input type="hidden" name="sID" value="<%=User.getsID()%>">
					<h2 class="heading">Enter  new username down :</h2>
					<input class="input" type="text" name="userUsername" value="<jsp:getProperty name = "User" property = "userUsername"/>">
					<h2 class="heading">Enter  new name down :</h2>
					<input class="input" type="text" name="userName" placeholder="name" value="<jsp:getProperty name = "User" property = "userName"/>" >
					<h2 class="heading">Enter  new pass down :</h2>
					<input class="input" type="text" name="userPass" placeholder="pass" value="<jsp:getProperty name = "User" property = "userPass"/>">
					<h2 class="heading">Work :</h2>
					<input class="input" type="text" name="userJob"  value="<jsp:getProperty name = "User" property = "userJob"/>">
					
					<button  class="button" type="button" onclick="firstBlock()">Save</button>
					
					
		
					
					</form>
					<span class="text ProfText"></span>
				</div>
			</div>
			
			<h1 class="heading centered">Skills</h1>
			
			<div class="infoBox">
			
			<form    class="secondBlock"  method="POST">
			
			<input type="hidden" name="sID" value="<%=User.getsID()%>">
				<div class="pro-skills">
					<h2 class="heading centered">Professional</h2>
						<span class="text">JAVA</span>
					 	<input  type="range" name="java" min="0" max="100" value="<jsp:getProperty name = "User" property = "java"/>">
					 	<span class="text">HTML</span>
					 	<input  type="range" name="html" min="0" max="100" value="<jsp:getProperty name = "User" property = "html"/>">
					 	<span class="text">CSS</span>
					 	<input  type="range" name="css" min="0" max="100" value="<jsp:getProperty name = "User" property = "css"/>">
					 	<span class="text">JavaScript</span>
					 	<input  type="range" name="javaScript" min="0" max="100" value="<jsp:getProperty name = "User" property = "javaScript"/>">
				</div>
				<div class="pers-skills">
					<h2 class="heading centered">Personal</h2>
						<span class="text">Communicative</span>
					 	<input  type="range" name="communicative" min="0" max="100" value="<jsp:getProperty name = "User" property = "communicative"/>">
					 	<span class="text">Teamwork</span>
					 	<input  type="range" name="teamwork" min="0" max="100" value="<jsp:getProperty name = "User" property = "teamwork"/>">
					 	<span class="text">Creativity</span>
					 	<input  type="range" name="creativity" min="0" max="100" value="<jsp:getProperty name = "User" property = "creativity"/>">
				</div>
				<button  class="button" type="button" onclick="secondBlock()">Save</button>
				</form>
			</div>

			<h1 class="heading centered contact-heading">Contacts</h1>
			<div class="infoBox">
			<form    class="tirdBlock"  method="POST">
			<input type="hidden" name="sID" value="<%=User.getsID()%>">
				<div class="conBox">
				
				
				
			
			
				
				
				
					<span class="text">Enter Email:</span>
					
					<input class="input" type="text" name="userEmail" placeholder="userEmail" value="<jsp:getProperty name = "User" property = "userEmail"/>">
					
				</div>

				<div class="conBox">
					<span class="text">City:</span>
					<span class="conText"><input class="input" type="text" name="userCity" placeholder="city" value="<jsp:getProperty name = "User" property = "userCity"/>"></span>
				</div>

				<div class="conBox">
					<span class="text">Phone:</span>
					<span class="conText"><input class="input" type="text" name="userPhoneNumber" placeholder="PhoneNumber" value="<jsp:getProperty name = "User" property = "userPhoneNumber"/>"></span>
				</div>

				<div class="conBox">
					<span class="text">Street:</span>
					<span class="conText"><input class="input" type="text" name="userStreet" placeholder="Street" value="<jsp:getProperty name = "User" property = "userStreet"/>"></span>
					
					
				</div>
				<button  class="button" type="button" onclick="tirdBlock()">Save</button>
				</form>
			</div>
		</div>
		
	</main>
	
		
	<footer class="footer"></footer>

</body>
</body>
</html>