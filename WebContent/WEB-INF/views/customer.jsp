<div style=" width: 700px; display:flex;">
	<div style="width: 80%;">A customer's currently held movies</div>
	<form action="${pageContext.request.contextPath}/transaction" method="POST">
		<input style="display: none;" type="text" name="userID" value="${user.id}"></input>
		<button type="submit" name="button" value="cus_1">-></button>
	</form>
</div>
<div style=" width: 700px; display:flex;">
	<div style="width: 80%;">A customer's queue of movies it would like to see</div>
	<form action="${pageContext.request.contextPath}/transaction" method="POST">
		<input style="display: none;" type="text" name="userID" value="${user.id}"></input>
		<button type="submit" name="button" value="cus_2">-></button>
	</form>
</div>
<div style=" width: 700px; display:flex;">
	<div style="width: 80%;">A customer's account settings</div>
	<form action="${pageContext.request.contextPath}/transaction" method="POST">
		<input style="display: none;" type="text" name="userID" value="${user.id}"></input>
		<button type="submit" name="button" value="cus_3">-></button>
	</form>
</div>
<div style=" width: 700px; display:flex;">
	<div style="width: 80%;">A history of all current and past orders a customer has placed</div>
	<form action="${pageContext.request.contextPath}/transaction" method="POST">
		<input style="display: none;" type="text" name="userID" value="${user.id}"></input>
		<button type="submit" name="button" value="cus_4">-></button>
	</form>
</div>
<div style=" width: 700px; display:flex;">
	<div style="width: 80%;">Movies available of a particular type</div>
	<form action="${pageContext.request.contextPath}/transaction" method="POST">
		<input style="display: none;" type="text" name="userID" value="${user.id}"></input>
		<button type="submit" name="button" value="cus_5">-></button>
	</form>
</div>
<div style=" width: 700px; display:flex;">
	<div style="width: 80%;">Movies available with a particular keyword or set of keywords in the movie name</div>
	<form action="${pageContext.request.contextPath}/transaction" method="POST">
		<input style="display: none;" type="text" name="userID" value="${user.id}"></input>
		<button type="submit" name="button" value="cus_6">-></button>
	</form>
</div>
<div style=" width: 700px; display:flex;">
	<div style="width: 80%;">Personalized movie suggestion list</div>
	<form action="${pageContext.request.contextPath}/transaction" method="POST">
		<input style="display: none;" type="text" name="userID" value="${user.id}"></input>
		<button type="submit" name="button" value="cus_7">-></button>
	</form>
</div>
<div style=" width: 700px; display:flex;">
	<div style="width: 80%;">Add movie to queue</div>
	<form action="${pageContext.request.contextPath}/transaction" method="POST">
		<input style="display: none;" type="text" name="userID" value="${user.id}"></input>
		<button type="submit" name="button" value="cus_8">-></button>
	</form>
</div>
