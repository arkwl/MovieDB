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
	<h2 align="center">Produced Customer Mailing List</h2>
	<table align="center" cellpadding="4" cellspacing="4">
		<tr>

		</tr>
		<tr bgcolor="#008000">
			<td><b>SSN</b></td>
			<td><b>First Name</b></td>
			<td><b>Last Name</b></td>
			<td><b>Address</b></td>
			<td><b>Email</b></td>
		</tr>

<%   
   stmt = c.createStatement();
	ResultSet rs_1 = stmt.executeQuery( "SELECT * FROM Customer" );

   ResultSet rs = stmt.executeQuery( "SELECT  P.SSN, P.FirstName, P.LastName, P.Address, C.Email FROM    Customer C, Person P WHERE   C.Id = P.SSN;" );
   while ( rs.next() ) {
      String  ssn = rs.getString("ssn");
      String  firstName = rs.getString("firstName");
      String  lastName = rs.getString("lastName");
      String  address = rs.getString("address");
      String  email = rs.getString("email");
      %>
      
      	<tr bgcolor="#8FBC8F">

			<td><%=rs.getString("ssn")%></td>
			<td><%=rs.getString("firstName")%></td>
			<td><%=rs.getString("lastName")%></td>
			<td><%=rs.getString("address")%></td>
			<td><%=rs.getString("email")%></td>

		</tr>

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