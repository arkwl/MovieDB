function query_1_1(){
	//TODO: if multiple movie types, parse it out
	//TODO: range of movie ratings
	//TODO: if similar movie names, give warning
	var form = document.getElementById("query_i");
	form.innerHTML = `
	<form method = "GET" action="/MovieDB/demo/formProcessing.jsp">
		<h3>Add Movie</h3>
		<div>Name: <input type="text" name="movieName" value=""></div>
		<div>Type: <input type="text" name="movieType" value="">   </div>
		<div>DistrFree: <input type="number" name="movieFee" value=""> </div>
		<div>NumCopies: <input type="number" name="movieCopies" value=""> </div>
		<div>Rating: <input type="number" name="movieRating" value=""> </div>
		<input type="submit" onClick="query_1_1_1()" value="Submit">
	</form>
	<br>
	<form method = "GET" action="/MovieDB/demo/formProcessing.jsp">
		<h3>Update Movie</h3>
		<div>Id: <input type="text" name="movieId" value=""></div>
		<div>Name: <input type="text" name="movieName" value=""></div>
		<div>Type: <input type="text" name="movieType" value="">   </div>
		<div>DistrFree: <input type="number" name="movieFee" value=""> </div>
		<div>NumCopies: <input type="number" name="movieCopies" value=""> </div>
		<div>Rating: <input type="number" name="movieRating" value=""> </div>
		<input type="submit" value="Submit">
	</form>
	<br>
	<form method = "GET" action="/MovieDB/demo/formProcessing.jsp">
	<% 
		<h3>Delete Movie</h3>
		<div>Id: <input type="text" name="movieId" value=""></div>
        <input type="submit" value="Submit">
    </form>`;
	
	//populate view of all movies 
	var table_view = document.getElementById("query_i");
}

function query_1_1_1(){
	var queryString = $('#query_1_1_1').serialize();
	var query_args = stringToDictionary(queryString);
	console.log("ok");
	var env = `<jsp:passInfo id="addMovie" class="webinterface.PassedInfo"></jsp:passInfo>`;
	//send it to database
	var send = `<jsp:setProperty  name="addMovie" property="movieName" value="`+query_args["movieName"]+`"/>`
	//populate view of all movies
}

function stringToDictionary(str){
	var obj = str.split("&").reduce(function(prev, curr, i, arr) {
	    var p = curr.split("=");
	    prev[decodeURIComponent(p[0])] = decodeURIComponent(p[1]);
	    return prev;
	}, {});
	return obj;
}
