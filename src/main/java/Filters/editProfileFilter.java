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
 * Servlet Filter implementation class editProfileFilter
 */
@WebFilter (urlPatterns =  "/editProfile")
public class editProfileFilter implements Filter {

    /**
     * Default constructor. 
     */
    public editProfileFilter() {
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
		
		
		
		HttpServletResponse httpResp = (HttpServletResponse) response;
        HttpServletRequest httpRequest = (HttpServletRequest) request;


        httpRequest.setCharacterEncoding("UTF-8");
        httpResp.setContentType("text/html charset=UTF-8");

        //if(httpRequest.getMethod().equalsIgnoreCase("GET"))
        //{
        HttpSession httpSession = httpRequest.getSession(false); 
        if (httpSession !=null && httpSession.getAttribute("User") != null) {

            User u = (User)httpSession.getAttribute("User");
            int id = Integer.parseInt(httpRequest.getParameter("Usid"));
            if(u.getsID()==id) {
            RequestDispatcher rd=httpRequest.getRequestDispatcher("EditProfile.jsp");
            rd.forward(httpRequest, httpResp);
            	//httpResp.sendRedirect("editProfile?Usid="+u.getsID());
            
            }
            else
            {
            	httpResp.sendRedirect("Profile?UID="+u.getsID());
            	
                
            }
            
        }
        else {
        	httpResp.sendRedirect("log");
        }

       // }
        chain.doFilter(httpRequest, httpResp);
		
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
