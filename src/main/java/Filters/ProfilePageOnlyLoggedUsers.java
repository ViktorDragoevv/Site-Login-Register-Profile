package Filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;
import model.UserRepository;

/**
 * Servlet Filter implementation class ProfilePageOnlyLoggedUsers
 */

@WebFilter (urlPatterns =  "/Profile")
public class ProfilePageOnlyLoggedUsers implements Filter {

    /**
     * Default constructor. 
     */
    public ProfilePageOnlyLoggedUsers() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		
    	
    		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		HttpSession session = req.getSession(false);
		/*
		if(session == null )
		{
			//this.context.log("Unauthorized access request");
			res.sendRedirect("login.jsp");
		}*/
    	
    	/*if( ((HttpServletRequest)request).getSession()==null)
    	{
    		
    		
    		RequestDispatcher requestDispatcher = request.getRequestDispatcher("Login.jsp");
    		requestDispatcher.forward(request,response);
    	return;
    
    	}*/
		
		
		User user =null;
		
		if(session != null)
		{
			user = (User) session.getAttribute("User");
			//System.out.print(user);
		}
		if(req.getMethod().equalsIgnoreCase("GET"))
        
        {
		if(user!=null)
		{
			//RequestDispatcher requestDispatcher = request.getRequestDispatcher("Profile.jsp");
			System.out.print("profile");
    		//requestDispatcher.forward(request,response);
    		chain.doFilter(request, response);
    		
		}
		else
		{
			res.sendRedirect("log");
			//System.out.print("toLog");
		}
        }
	
    	
		
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
