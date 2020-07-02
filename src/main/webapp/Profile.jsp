<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.User" %>
    <%@ page import="model.UserRepository"
    
     %>
   
   
   
    
    
    
<!DOCTYPE html>
<html>
<head>
	<title></title>
	 <link rel="stylesheet" type="text/css" href="css.css">
	 <style>

#prBar {
  background-color: #012e5e;
  padding: 3px;
}

#prBar>div {
  background-color: #ffb606;
  height: 10px;
  width:10%;
  
}

a:visited {
  color: red;
  
}


 

	 
</style>	 
	 
</head>

<body>
		
<jsp:useBean id = "User" class = "model.User" scope="session"> 
        
          </jsp:useBean>
          
          
     <%
     User user;
     int id=0;
     if(request.getParameter("UID")!=null) { id=Integer.parseInt( request.getParameter("UID"));}
     
     if(id == User.getsID())
    	 {
    	 user = User;
    	 }
    	 else
    	 {
    	 
    		 user = (User) UserRepository.getInstance().returnUser(id);
    	 }
    	 %>
          

<header class="header">
	<form class="form"  action="logOut" method="get">
	
	<a  href="logOut" style="font-size: 20px ">Logout</a>
	</form>
	
	<form class="form"  action="ul" method="get">
<input class="ybtn" type="Submit"  value="Potrebiteli" >
</form>
	
	
	
	<form class="form"  action="ck" method="get">
	<%
	
	Cookie[] cookies = request.getCookies();
	
		
        boolean foundCookie = false;

        for(int i = 0; i < cookies.length; i++) { 
            Cookie c = cookies[i];
            if (c.getValue().equals(User.getUserName())) {
               
                foundCookie = true;
            }
        }  

        if (!foundCookie) {
        
		
		 %>
		 
  

			<h1 align="center" >Dobre Doshli!</h1>
			<p align="center">
	  		<input  type="Submit" style="text-align: center;"  value="close" class="button2">
	</p>
	<%} %>
	
	
	
	
	
	
	
	
        
        
	
	
	</form>
	
	
	</header>


	



          <form class="form" action="editProfile?Usid=<%=user.getsID() %>" method="GET">
 <input type="hidden" name="Usid" value="<%=User.getsID()%>">

	 


	
	
	
	<main class="main">
	
		<div class="shell">
		
			<div class="userProf">
				<img class="image" src="user.jpg" />

				<div class="ProfInfo">
				
				<%
				
		        HttpServletRequest httpRequest = (HttpServletRequest) request;
				int idd=0;
				
				  //idd = getParameter("Usidd");
				
				 //User u = session.getAttribute("User");
				if(user.getsID()==User.getsID()){
					
				
				%>
				<input type="Submit" value="EditInformation" class="button">
				<%} %>
				
				
				
				
				
					<h2 class="heading">Profile Information</h2>
					<span class="text">Name:<%=user.getUserName()%></span>
					<span class="text">Work: <%=user.getUserJob()%> </span>
					<span class="text ProfText"></span>
				</div>
			</div>
			
			<h1 class="heading centered">Skills</h1>
			<div class="infoBox">
				<div class="pro-skills">
					<h2 class="heading centered">Professional</h2>
						<span class="text">JAVA</span>
						
					 	<div id="prBar" ><div style="width:<%=user.getJava()%>%"></div></div>
					 	<span class="text">HTML</span>
					 	
					 	<div id="prBar"><div style="width:<%=user.getHtml()%>%"></div></div>
					 	<span class="text">CSS</span>
					 	
					 	<div id="prBar"><div style="width:<%=user.getCss()%>%"></div></div>
					 	<span class="text">JavaScript</span>
					 	
					 	<div id="prBar"><div style="width:<%=user.getJavaScript()%>%"></div></div>
				</div>
				<div class="pers-skills">
					<h2 class="heading centered">Personal</h2>
						<span class="text">Communicative</span>
					 	<div id="prBar"><div style="width:<%=user.getCommunicative()%>%"></div></div>
					 	<span class="text">Teamwork</span>
					 	<div id="prBar"><div style="width:<%=user.getTeamwork()%>%"></div></div>
					 	<span class="text">Creativity</span>
					 	<div id="prBar"><div style="width:<%=user.getCreativity()%>%"></div></div>
				</div>
			</div>

			<h1 class="heading centered contact-heading">Contacts</h1>
			<div class="infoBox">
				<div class="conBox">
					<span class="text">Email: <%=user.getUserEmail()%></span>
					<a href="mailto:ivan@tu-varna.bg" class="conText"></a>
				</div>

				<div class="conBox">
					<span class="text">City:<%=user.getUserCity()%></span>
					<span class="conText"></span>
				</div>

				<div class="conBox">
					<span class="text">Phone:<%=user.getUserPhoneNumber()%></span>
					<span class="conText"></span>
				</div>

				<div class="conBox">
					<span class="text">Street:<%=user.getUserStreet()%></span>
					<span class="conText"></span>
				</div>
			</div>
		</div>
		
		
		
		
	</main>
	
	<footer class="footer"></footer>
	</form>
</body>

</html>