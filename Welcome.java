package com;
import java.io.PrintWriter; 

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();    
		    String n=request.getParameter("username");  
		     out.print("Welcome "+n);
		     response.setContentType("text/html");  
			   out.print("<form action='LogoutServlet'>");
			   out.println("<input type='submit' value='logout'>");
				out.print("</form>");
				 response.setContentType("text/html");  
				   out.print("Make Payment For Your Enrolled Policy");
				   out.print("<form action='PaymentServlet'>");
				out.println("<input type='submit' value='Pay'>");
					out.print("</form>");
					response.setContentType("text/html");
					out.print("Register for Complain");
					out.print("<form action = 'register.html''>");
					out.println("<input type='submit' value='register'>");
					out.println("</form>");
				out.close(); 
	}
}
