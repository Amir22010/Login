package com;
import java.io.PrintWriter;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();      
       String n=request.getParameter("username");  
	    String p=request.getParameter("userpass");          
		  if(LoginDetail.validate(n, p)){  
			  String a=request.getParameter("username");
			  request.setAttribute("name", a);
 RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");  
       rd.forward(request,response);  
		  }  
		   else{  
		     out.print("Sorry username or password error");  
		     RequestDispatcher rd=request.getRequestDispatcher("index.html");  
		      rd.include(request,response);  
		   }  
		
		    out.close();  

	}

}
