package fr.insa.soa.Project_SOA;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;


/**
 * Servlet implementation class LoginVerify
 */
@WebServlet("/Login_Check1")
public class Login_Check extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
	public Login_Check() {
		super();
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
		String login = request.getParameter("username");
		String password = request.getParameter("password");
		if (login.equals("admin") && password.equals("admin")) {
			response.sendRedirect("index.jsp");
		}
		else 
		{
			response.sendRedirect("error.jsp");
		}

		
		
		doGet(request, response);
	}

}
