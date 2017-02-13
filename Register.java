package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name= request.getParameter("name");
		String mobile= request.getParameter("mobile");
		response.setContentType("text/html");
		
		try{
	        //load the jdbc driver

	        Class.forName("oracle.jdbc.OracleDriver");

	       //create connection object

	String url="jdbc:oracle:thin:@localhost:1521/xe";
	Connection con= DriverManager.getConnection(url,"babu","babu");
	String sql="Insert into comp_reg values(?,?)";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1, name);
	ps.setString(2, mobile);

	ps.executeUpdate();
	con.commit();
	con.close();
	System.out.println("Record Inserted");
	out.println("Your Complain Sucessfully Registered We Will be Get Back to You Soon");
}
	catch(Exception e)
	{
	e.printStackTrace();
	}
		}
}



