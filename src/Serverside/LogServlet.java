package Serverside;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class LogServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		boolean loginSuccess = false;
		boolean nameS = false;
		boolean passS = false;
		String name = req.getParameter("username");
		String pass = req.getParameter("password");
		if (name != null || pass != null) {
			FileInputStream fstream = new FileInputStream("users.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line;
			while ((line = br.readLine()) != null){
				nameS = false;
				nameS = name.equals(line);
				passS = false;
				passS = name.equals(line);
				
			}
			loginSuccess = ("Bo".equals(name) && "secret".equals(pass));
			if (!loginSuccess) {
				req.setAttribute("msgs",
						"Username and/or password are incorrect!");
			}
			in.close();
		}
		RequestDispatcher rd = null;
		if (loginSuccess)
			rd = req.getRequestDispatcher("MyAccount.jsp");
		else
			rd = req.getRequestDispatcher("loginpage.jsp");
		rd.forward(req, resp);

	}
}