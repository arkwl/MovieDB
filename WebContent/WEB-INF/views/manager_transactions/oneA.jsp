<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Employee Transaction</title>
	<link rel="stylesheet" type="text/css" href="css/movie.css">
</head>
<body>
	<div class="center">
		<h3>Add a movie:</h3>
		<p style="color: red;">${errorString}</p>
		<p style="color: white;">${successString}</p>
		<form action="${pageContext.request.contextPath}/insert" method="POST">
			<table border="0">
          <tr>
             <td>Movie ID:</td>
             <td><input type="text" name="id" /> </td>
          </tr>
          <tr>
             <td>Movie Name:</td>
             <td><input type="text" name="name" /> </td>
          </tr>
          <tr>
             <td>Movie Type:</td>
             <td><input type="text" name="type"  /> </td>
          </tr>
          <tr>
             <td>Rating:</td>
             <td><input type="text" name="rating"  /> </td>
          </tr>
          <tr>
             <td>Distribution Fee:</td>
             <td><input type="text" name="distrfee"  /> </td>
          </tr>
          <tr>
             <td>Number of Copies:</td>
             <td><input type="text" name="numcopies"  /> </td>
          </tr>
          <tr style="display: none;">
          	<td><input type="text" name="queryType" value="man1a" /> </td>
          </tr>
          <tr>
             <td colspan ="2">
                <input type="submit" value= "Submit" />
             </td>
          </tr>
       </table>
		</form>
		<form action="${pageContext.request.contextPath}/transaction" method="POST">
			<button type="submit" name="button" value="home">Home</button>
		</form>
		<form action="${pageContext.request.contextPath}/transaction" method="POST">
			<button type="submit" name="button" value="help">Help</button>
		</form>
	</div>
</body>
</html>