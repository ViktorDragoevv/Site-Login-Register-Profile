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
 * Servlet implementation class editProfileBlock3
 */
@WebServlet("/editsecondblock")
public class editProfileBlock3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Gson gson;

    public void init() throws ServletException {
       gson  = new Gson();
   }
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editProfileBlock3() {
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
		 currentUser.setJava(newUser.getJava());
	        currentUser.setHtml(newUser.getHtml());
	        currentUser.setCss(newUser.getCss());
	        currentUser.setJavaScript(newUser.getJavaScript());
	        currentUser.setCommunicative(newUser.getCommunicative());
	        currentUser.setTeamwork(newUser.getTeamwork());
	        currentUser.setCreativity(newUser.getCreativity());
	        UserRepository.getInstance().update();
		
	}

}
