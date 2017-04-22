<%@ page import="java.util.Random,java.text.*"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>MovieDB</title>
	<link rel="stylesheet" href="style.css">
	
</head>
<body>
	<div id="banner">
		<div class="left">MovieMoose</div>
		<div class="right" style="display: flex;">
			<div style="font-size:30px;">User Level:</div>
			<select>
				<option>Manager</option>
				<option>Customer Representative</option>
				<option>Customer</option>
			</select>
		</div>
	</div>
	<div style="height:800px;">
		<div id="query_options">
			<div class="query_header">Manager Level Transactions</div>
			<ul style="padding-right:40px;">
				<li class="list_item">
					<div style="width:80%;">Add, Edit and Delete movies</div>
					<button class="query_button">-></button>
				</li>
				<li class="list_item">
					<div style="width:80%;">Add, Edit and Delete information for an employee</div>
					<button class="query_button">-></button>
				</li>
				<li class="list_item">
					<div style="width:80%;">Obtain a sales report for a particular month</div>
					<button class="query_button">-></button>
				</li>
				<li class="list_item">
					<div style="width:80%;">Produce a comprehensive listing of all movies</div>
					<button class="query_button">-></button>
				</li>
				<li class="list_item">
					<div style="width:80%;">Produce a list of movie rentals by movie name, movie type, or customer name</div>
					<button class="query_button">-></button>
				</li>
				<li class="list_item">
					<div style="width:80%;">Determine which customer representative oversaw the most transactions</div>
					<button class="query_button">-></button>
				</li>
				<li class="list_item">
					<div style="width:80%;">Produce a list of most active customers</div>
					<button class="query_button">-></button>
				</li>
				<li class="list_item">
					<div style="width:80%;">Produce a list of most actively rented movies</div>
					<button class="query_button">-></button>
				</li>
			</ul> 
			<div class="query_header">Representative Level Transactions</div>
			<ul style="padding-right:40px;">
				<li class="list_item">
					<div style="width:80%;">Record an order</div>
					<button class="query_button">-></button>
				</li>
				<li class="list_item">
					<div style="width:80%;">Add, Edit and Delete information for a customer</div>
					<button class="query_button">-></button>
				</li>
				<li class="list_item">
					<div style="width:80%;">Produce customer mailing lists</div>
					<button class="query_button">-></button>
				</li>
				<li class="list_item">
					<div style="width:80%;">Produce a list of movie suggestions for a given customer</div>
					<button class="query_button">-></button>
				</li>
			</ul> 
			<div class="query_header">Customer Level Transactions</div>
			<ul style="padding-right:40px;">
				<li class="list_item">
					<div style="width:80%;">A customer's currently held movies</div>
					<button class="query_button">-></button>
				</li>
				<li class="list_item">
					<div style="width:80%;">A customer's queue of movies it would like to see</div>
					<button class="query_button">-></button>
				</li>
				<li class="list_item">
					<div style="width:80%;">A customer's account settings</div>
					<button class="query_button">-></button>
				</li>
				<li class="list_item">
					<div style="width:80%;">A history of all current and past orders a customer has placed</div>
					<button class="query_button">-></button>
				</li>
				<li class="list_item">
					<div style="width:80%;">Movies available of a particular type</div>
					<button class="query_button">-></button>
				</li>
				<li class="list_item">
					<div style="width:80%;">Movies available with a particular keyword or set of keywords in the movie name</div>
					<button class="query_button">-></button>
				</li>
				<li class="list_item">
					<div style="width:80%;">Movies available starring a particular actor or group of actors</div>
					<button class="query_button">-></button>
				</li>
				<li class="list_item">
					<div style="width:80%;">Personalized movie suggestion list</div>
					<button class="query_button">-></button>
				</li>
				<li class="list_item">
					<div style="width:80%;">Rate the movies they have rented</div>
					<button class="query_button">-></button>
				</li>
			</ul> 
		</div>
		<div id="query_io">
		</div>
	</div>
	<%@ include file="/fragment/footer.html"%>
</body>
</html>