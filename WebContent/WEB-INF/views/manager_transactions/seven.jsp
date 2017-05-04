<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/movie.css">
<title>Employee Transaction</title>
</head>
<body>
	<%@page import="java.sql.DriverManager"%>
	<%@page import="java.sql.ResultSet"%>
	<%@page import="java.sql.Statement"%>
	<%@page import="java.sql.Connection"%>

	<%
	//String userId = request.getParameter("customerID");
	//String name = request.getParameter("name");
Connection c = null;
Statement stmt = null;
try {
   Class.forName("org.postgresql.Driver");
   c = DriverManager
      .getConnection("jdbc:postgresql://localhost:5432/movie_system",
      "postgres", "smolka");
   c.setAutoCommit(false);
   System.out.println("Opened database successfully");
%>
<div class="center">
	<h2 align="center">A list of most active customers.</h2>
	<table align="center" cellpadding="4" cellspacing="4">
		<tr>

		</tr>
		<tr bgcolor="#008000">
			<td><b>Customer ID</b></td>
			<td><b>First Name</b></td>
			<td><b>Last Name</b></td>
			<td><b>Rating</b></td>
			<td><b>Number of Orders</b></td>
		</tr>

<%   
   stmt = c.createStatement();

   ResultSet rs = stmt.executeQuery( "SELECT N.CustId, N.FirstName, N.LastName, N.Rating, C.NumOrders "+
			"FROM CountOrders C, Name N " +
		   "WHERE N.CustId = C.CustId AND C.NumOrders >= (SELECT MAX(D.NumOrders) FROM CountOrders D)");
   int count = 0;
   
   while ( rs.next() ) {
	   count++;
	   String  custid = rs.getString("custid");
      String  firstname = rs.getString("firstname");
      String  lastname = rs.getString("lastname");
      String  rating = rs.getString("rating");
      String  numorders = rs.getString("numorders");
      %>
      
      	<tr bgcolor="#8FBC8F">
      		<td><%=rs.getString("custid")%></td>
			<td><%=rs.getString("firstname")%></td>
			<td><%=rs.getString("lastname")%></td>
			<td><%=rs.getString("rating")%></td>
			<td><%=rs.getString("numorders")%></td>
		</tr>

      <%
   }
   
   if (count <= 0){
	   %>
	   <div>You don't have any movies in your queue!</div>
	   <%
   }
   rs.close();
   stmt.close();
   c.close();
} catch ( Exception e ) {
   System.err.println( e.getClass().getName()+": "+ e.getMessage() );
   System.exit(0);
}
System.out.println("Operation done successfully");
%>
	
	</table>
	<form action="${pageContext.request.contextPath}/transaction" method="POST">
		<button type="submit" name="button" value="home">Home</button>
	</form>
	<form action="${pageContext.request.contextPath}/transaction" method="POST">
			<button type="submit" name="button" value="help">Help</button>
		</form>
</div>

</body>
</html>