<html>
<head>
<title>Using GET and POST Method to Read Form Data</title>
</head>
<body>
<h1>Using GET Method to Read Form Data</h1>
<ul>
<li><p><b>Movie Name:</b>
   <%= request.getParameter("movieName")%>
</p></li>
</ul>
</body>
</html>