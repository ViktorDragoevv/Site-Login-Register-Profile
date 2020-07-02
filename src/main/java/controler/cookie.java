package controler;

import java.io.IOException;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;
import model.UserRepository;

/**
 * Servlet implementation class cookie
 */
@WebServlet("/ck")
public class cookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		 
		
		User user =(User) session.getAttribute("User");
		String Uname =user.getUserName();
		
		
		
		Cookie cok = new Cookie("umane", Uname);
		
		LocalTime now = LocalTime.now();
	    int seconds=86400-LocalTime.now().toSecondOfDay()-1;
	    cok.setMaxAge(seconds);
	    
		
		response.addCookie(cok); 
		response.sendRedirect("Profile?UID="+user.getsID());
		
		
		
		 
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
