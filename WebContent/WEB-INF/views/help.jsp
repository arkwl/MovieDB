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
	<div style="background-color: rgba(0, 0, 0, 0.3); padding: 10px 10px 10px 10px; margin-left:200px; margin-right:200px;">
		<h1>Help Menu!</h1>
		<p>Welcome to MovieMoose! Every option, query, and form is explained below.</p>
		<h2>Login</h2>
		<p>Insert first name, last name, and ssn to log in!</p>
		<h2>User Level View</h2>
		
		<h3>Manager Transactions</h3>
		<p>Add Movie: Fill all inputs to submit a movie within the database.</p>
		<p>Update Movie: Fill in movie ID, then choose one input to change it's existing value within the database.</p>
		<p>Delete Movie: Fill in movie ID to delete a movie within the database.</p>
		<p>Add Employee: Fill all inputs to submit an employee within the database.</p>
		<p>Update Employee: Fill in employee ID or SSN, then choose one input to change it's existing value within the database.</p>
		<p>Delete Employee: Fill in employee ID or SSN, to delete a movie within the database.</p>
		<p>Obtain a sales report for a particular month: Input the two digit numerical value of the month.</p>
		<p>TODO.</p>
		<p>Produce a comprehensive listing of all movies: Just click!</p>
		<p>TODO.</p>
		<p>Determine which customer representative oversaw the most transactions: Just click!</p>
		<p>TODO.</p>
		<p>TODO.</p>
		
		<h3>Employee Transactions</h3>
		<p>Record an Order: Fill all inputs to submit an order within the database.</p>
		<p>Add Customer: Fill all inputs to submit an customer within the database.</p>
		<p>Update Customer: Fill in customer ID or SSN, then choose one input to change it's existing value within the database.</p>
		<p>Delete Customer: Fill in customer ID or SSN, to delete a customer within the database.</p>
		<p>Produce customer mailing lists: Just click!</p>
		<p>Produce a list of movie suggestions for a given customer: Just click!</p>
		
		<h3>Customer Transactions</h3>
		
		<p>A customer's currently held movies: Just click!</p>
		<p>A customer's queue of movies it would like to see: Just click!</p>
		<p>A customer's account settings: Just click!</p>
		<p>A history of all current and past orders a customer has placed: Just click!</p>
		<p>Movies available of a particular type: Just click!</p>
		<p>Movies available with a particular keyword or set of keywords in the movie name: Search for a topic in the input field.</p>
		<p>Personalized movie suggestion list: Just click!</p>
		<p>Rate the movies they have rented: TODO</p>
		<form action="${pageContext.request.contextPath}/transaction" method="POST">
			<button type="submit" name="button" value="home">Home</button>
		</form>
	</div>
</body>
</html>
