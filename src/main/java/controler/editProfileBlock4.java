package controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import model.User;
import model.UserRepository;

/**
 * Servlet implementation class editProfileBlock4
 */
@WebServlet("/edit3block")
public class editProfileBlock4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Gson gson;

    public void init() throws ServletException {
       gson  = new Gson();
    }
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editProfileBlock4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		
		
		StringBuilder sb = new StringBuilder();
		String s;
		while ((s = request.getReader().readLine()) != null) {
		    sb.append(s);
		}
		
		User newUser = (User) gson.fromJson(sb.toString(), User.class);
		 int id = Integer.parseInt(request.getParameter("Usid"));
		 User currentUser = UserRepository.getInstance().returnUser(id);
		
		
		
		   currentUser.setUserEmail(newUser.getUserEmail());
	        currentUser.setUserCity(newUser.getUserCity());
	        currentUser.setUserPhoneNumber(newUser.getUserPhoneNumber());
	        currentUser.setUserStreet(newUser.getUserStreet());
	        UserRepository.getInstance().update();
	}

}
