package Serverside;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {
	private boolean saved;
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		saved = false;
		String name = req.getParameter("username");
		String pass = req.getParameter("password");
		String repass = req.getParameter("repassword");
		if (name != null || pass != null && repass == pass){
			try {
		        BufferedWriter out = new BufferedWriter(new FileWriter("users.txt"));
	            for (int i = 0; i < 4; i++) {
	                out.write("test " + "\n");
	            }
	            out.close();
				saved = true;
				System.out.println("Gesaved!");

			}
			catch(IOException i) {
				i.printStackTrace();
			}		
		}
	}
}