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
		<h3>Delete a customer:</h3>
		<p style="color: red;">${errorString}</p>
		<p style="color: white;">${successString}</p>
		<form action="${pageContext.request.contextPath}/insert" method="POST">
			<table border="0">
          <tr>
             <td>SSN:</td>
             <td><input type="text" name="ssn" /> </td>
          </tr>
          <tr style="display: none;">
          	<td><input type="text" name="queryType" value="emp2c" /> </td>
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