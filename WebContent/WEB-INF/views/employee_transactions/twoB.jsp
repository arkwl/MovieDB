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
		<h3>Update information for a customer:</h3>
		<p style="color: red;">${errorString}</p>
		<p style="color: white;">${successString}</p>
		<form action="${pageContext.request.contextPath}/insert" method="POST">
			<table border="0">
          <tr>
             <td>SSN:</td>
             <td><input type="text" name="ssn" /> </td>
          </tr>
          <tr>
             <td>First Name:</td>
             <td><input type="text" name="firstName" /> </td>
          </tr>
          <tr>
             <td>Last Name:</td>
             <td><input type="text" name="lastName"  /> </td>
          </tr>
          <tr>
             <td>Address:</td>
             <td><input type="text" name="address"  /> </td>
          </tr>
          <tr>
             <td>ZIP Code:</td>
             <td><input type="text" name="zipcode"  /> </td>
          </tr>
          <tr>
             <td>Telephone:</td>
             <td><input type="text" name="telephone"  /> </td>
          </tr>
          <tr>
             <td>Credit Card Number:</td>
             <td><input type="text" name="cc"  /> </td>
          </tr>
          <tr>
             <td>Rating:</td>
             <td><input type="text" name="rating"  /> </td>
          </tr>
          <tr>
             <td>Email:</td>
             <td><input type="text" name="email"  /> </td>
          </tr>
          <tr style="display: none;">
          	<td><input type="text" name="queryType" value="emp2b" /> </td>
          </tr>
          <tr>
             <td colspan ="2">
                <input type="submit" value= "Submit" />
             </td>
          </tr>
       </table>
		</form>
		<form action="${pageContext.request.contextPath}/view" method="POST">
		<button type="submit" name="button" value="emp_1">View Data</button>
	</form>
	</div>
</body>
</html>