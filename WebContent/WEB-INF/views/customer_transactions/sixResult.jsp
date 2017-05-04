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
	String keyword = request.getParameter("keyword");
	keyword = keyword.replace(' ', '%');
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
	<h2 align="center">Movies of the Same Type</h2>
	<table align="center" cellpadding="4" cellspacing="4">
		<tr>

		</tr>
		<tr bgcolor="#008000">
			<td><b>Movie ID</b></td>
			<td><b>Movie Name</b></td>
			<td><b>Movie Type</b></td>
		</tr>

<%   
   stmt = c.createStatement();

   ResultSet rs = stmt.executeQuery( "SELECT M.Id, M.Name, M.Type "+
		   "FROM Movie M " +
		   "WHERE M.Name LIKE '%"+keyword+"%' ");
   int count = 0;
   
   while ( rs.next() ) {
	   count++;
      String  id = rs.getString("id");
      String  movieid = rs.getString("name");
      String  custRepId = rs.getString("type");
      %>
      
      	<tr bgcolor="#8FBC8F">
			<td><%=rs.getString("id")%></td>
			<td><%=rs.getString("name")%></td>
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
	<form action="${pageContext.request.contextPath}/transaction" method="POST">
		<button type="submit" name="button" value="home">Home</button>
	</form>
	<form action="${pageContext.request.contextPath}/transaction" method="POST">
			<button type="submit" name="button" value="help">Help</button>
		</form>
</div>

</body>
</html>