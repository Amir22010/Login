<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

<div align= "right">
  <%String name=(String)request.getAttribute("name");
out.print("Welcome"+" "+name);%>
<form action="LogoutServlet">
<input type='submit' value='logout'>
</form>
</div>

<%= "Make Payment for Enrolled Policy"%>
	<form action="PaymentServlet">
	<input type="submit" value="Pay">
	</form>
	
	<div>
	<%= "Register for Complain"%>
	<form action = "register.html">
	<input type='submit' value="register">
	</form>
	</div>
	
	<div>
	<%= "Enrolled Policy"%>
	<form action ="policy.jsp">
	<input type="submit" value="View">
	</form>
	</div>
</body>
</html>