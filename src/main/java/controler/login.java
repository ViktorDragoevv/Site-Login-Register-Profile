package controler;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.UserRepository;
import model.User;


@WebServlet(urlPatterns = {"/index.jsp","/log"})
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public login() {
        super();
    }
    
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("Login.jsp");
		requestDispatcher.forward(request,response);
		
		

	/*
    	
    	HttpSession session = request.getSession();
    	if( session.getAttribute("User")!=null && session!=null)
    	{
    		
    		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Profile.jsp");
			requestDispatcher.forward(request,response);
    	}
    		
    	
    	
    	else
    	{
    		
    		
    		RequestDispatcher requestDispatcher = request.getRequestDispatcher("Login.jsp");
    		requestDispatcher.forward(request,response);
			
					
					
    	
    	
    
    }
    */
    
	}

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("user");
		
		
		String password=request.getParameter("pass");
		
		
		
		if(UserRepository.getInstance().isInTheCollection(username, password)==true) 
			
		{
			
         //User user=UserRepository.getInstance().returnLogin(username, password);
         
 
    	    //request.setAttribute("User", user);	

			
    	      User user = UserRepository.getInstance().returnUser(UserRepository.getInstance().returnId(username));
    	      HttpSession session = request.getSession();
    	      session.setAttribute("User", user);
    	      
    	     // response.sendRedirect("editProfile");
    	      response.sendRedirect("editProfile?Usid="+UserRepository.getInstance().returnId(username));
    	      		
    	      
         
        }
		
		else
			
		{
			
			response.getWriter().append("Served at: ").append("Greshna parola ili potrebitelsko ime");
			
		}
		
	}

}
