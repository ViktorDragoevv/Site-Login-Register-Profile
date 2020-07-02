package controler;

import java.io.IOException;
import java.util.HashSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import model.User;
import model.UserRepository;

/**
 * Servlet implementation class editProfile
 */
@WebServlet("/ch")
public class editProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Gson gson;

    public void init() throws ServletException {
       gson  = new Gson();
   }
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
    
		
	/*	
		
		//RequestDispatcher requestDi=request.getRequestDispatcher("Profile.jsp");
		
		int id = Integer.parseInt(request.getParameter("UID"));
		response.sendRedirect("editProfile?UID="+UserRepository.getInstance().returnUser(id));
		request.setAttribute("User", UserRepository.getInstance().returnUser(id));
		//requestDi.forward(request, response);


	*/
		
		/*HttpSession session = request.getSession();
    	if( session.getAttribute("User")!=null && session!=null)
    	{
    		
    		RequestDispatcher requestDi =request.getRequestDispatcher("Profile.jsp");
            int id = Integer.parseInt(request.getParameter("UID"));
            request.setAttribute("User", UserRepository.getInstance().returnUser(id));
            requestDi.forward(request, response);
    		
    		// RequestDispatcher requestDi =request.getRequestDispatcher("Profile.jsp");
    	        
    	      //  requestDi.forward(request, response);
    	}
    		
    	
    	
    	else
    	{
    		
    		
    		RequestDispatcher requestDispatcher = request.getRequestDispatcher("Login.jsp");
    		requestDispatcher.forward(request,response);
        
    	}
        */
       
        
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/*
		 int id = Integer.parseInt(request.getParameter("Usidd"));
		String username=request.getParameter("username");
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		String email=request.getParameter("email");
		String city=request.getParameter("city");
		String phone=request.getParameter("phone");
		String street=request.getParameter("street");
		String work=request.getParameter("work");
		int java =Integer.parseInt(request.getParameter("java"));
		int html =Integer.parseInt(request.getParameter("html"));
		int css =Integer.parseInt(request.getParameter("css"));
		int javaScript =Integer.parseInt(request.getParameter("javaScript"));
		int communicative =Integer.parseInt(request.getParameter("communicative"));
		int teamwork =Integer.parseInt(request.getParameter("teamwork"));
		int creativity =Integer.parseInt(request.getParameter("creativity"));

		
       
        User currentUser = UserRepository.getInstance().returnUser(id);
        currentUser.setUserName(name);
        currentUser.setUserUsername(username);
        currentUser.setUserPass(pass);
        currentUser.setUserEmail(email);
        currentUser.setUserCity(city);
        currentUser.setUserPhoneNumber(phone);
        currentUser.setUserStreet(street);
        currentUser.setUserJob(work);
        currentUser.setJava(java);
        currentUser.setHtml(html);
        currentUser.setCss(css);
        currentUser.setJavaScript(javaScript);
        currentUser.setCommunicative(communicative);
        currentUser.setTeamwork(teamwork);
        currentUser.setCreativity(creativity);
        
        
       
        response.sendRedirect("Profile?UID="+currentUser.getsID());
		
		//RequestDispatcher requestDispatcher = request
				
              //  .getRequestDispatcher("/Profile.jsp");
		
       // requestDispatcher.forward(request, response);	
		
		*/
		
		
		
	}

	

}
