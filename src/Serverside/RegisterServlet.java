package Serverside;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {
	private ArrayList<User> users;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("username");
		String pass = req.getParameter("password");
		String repass = req.getParameter("repassword");
		System.out.println("TEST");

		if (name != null && pass != null && repass == pass){
			User user = new User(name, pass);
			users = (ArrayList<User>)getServletContext().getAttribute("users");
			if (users == null){
				users = new ArrayList();
			}
			users.add(user);
			getServletContext().setAttribute("users", users);
			System.out.println((ArrayList<User>)getServletContext().getAttribute("users"));
		}
		RequestDispatcher rd = null;

		rd = req.getRequestDispatcher("loginpage.jsp");
		rd.forward(req, resp);

	}
}