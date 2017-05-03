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
	String userId = request.getParameter("userID");
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
	<h2 align="center">Your Account Settings</h2>
	<table align="center" cellpadding="4" cellspacing="4">
		<tr>

		</tr>
		<tr bgcolor="#008000">
			<td><b>Account ID</b></td>
			<td><b>Date Account was Opened</b></td>
			<td><b>Account Type</b></td>
		</tr>

<%   
   stmt = c.createStatement();

   ResultSet rs = stmt.executeQuery( "SELECT A.Id, A.DateOpened, A.Type "+
		   "FROM Account A " + 
		    "WHERE A.Customer  = '" + userId + "'" );
   int count = 0;
   
   while ( rs.next() ) {
	   count++;
      String  name = rs.getString("id");
      String  dateOpened = rs.getString("dateOpened");
      String  type = rs.getString("type");
      %>
      
      	<tr bgcolor="#8FBC8F">

			<td><%=rs.getString("id")%></td>
			<td><%=rs.getString("dateOpened")%></td>
			<td><%=rs.getString("type")%></td>

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
</div>

</body>
</html>