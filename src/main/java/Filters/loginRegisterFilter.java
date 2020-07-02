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

/**
 * Servlet Filter implementation class loginRegisterFilter
 */
@WebFilter(urlPatterns = {"/log","/reg"} )
public class loginRegisterFilter implements Filter {

    /**
     * Default constructor. 
     */
    public loginRegisterFilter() {
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
		HttpServletResponse res = (HttpServletResponse) response;
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session =  req.getSession();
    	if( session.getAttribute("User")!=null && session!=null)
    	{
    		User u = (User) session.getAttribute("User");
    		res.sendRedirect("Profile?UID="+u.getsID());
    		//RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Profile.jsp");
			//requestDispatcher.forward(request,response);
    	}
    		
    	
    	
    	else
    	{
    		
    		
    		
			
		
		chain.doFilter(request, response);
		
		
    	}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
