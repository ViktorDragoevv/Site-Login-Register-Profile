package controler;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.UserRepository;
import model.User;

@WebServlet("/reg")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public register() {
        super();
    }
    
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
	
	RequestDispatcher requestDispatcher = request.getRequestDispatcher("indexV.jsp");
	requestDispatcher.forward(request,response);
	
    	
	/*HttpSession session = request.getSession();
	if( session.getAttribute("User")!=null && session!=null)
	{
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Profile.jsp");
		requestDispatcher.forward(request,response);
	}
		
	
	
	else
	{
		
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("indexV.jsp");
		requestDispatcher.forward(request,response);
		
	

}*/	
    
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name= request.getParameter("name");	
		
		String username=request.getParameter("username");
		
		String password=request.getParameter("password");
		
		String repeatpass=request.getParameter("repeatpass");
		
		String userJob=request.getParameter("job");
		
		String userDescription=request.getParameter("description");
		
		String email=request.getParameter("email");
		
		String userPhoneNumber=request.getParameter("phoneNumber");
		
		String city=request.getParameter("city");
		
		String street=request.getParameter("street");
		
		if(password.equals(repeatpass)) {
			
		User user=new User(username,password,name);
		
		if(UserRepository.getInstance().isInTheCollection(user.getUserUsername(),user.getUserPass())==true) 
		{
			response.getWriter().append("Served at: ").append("Zaeto potrebitelsko ime!");
		}
		
		else
		{
			
			UserRepository.getInstance().addToTheCollection(user);
			
			request.getSession().setAttribute("User", user);	
			
			RequestDispatcher requestDispatcher = request
					
                    .getRequestDispatcher("/Login.jsp");
			
            requestDispatcher.forward(request, response);	
            }
		}
		
		else {
			
		response.getWriter().append("Served at: ").append("Dvete paroli ne suvpadat");
		
		}
}
    
}

