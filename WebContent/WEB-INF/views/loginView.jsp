<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="css/movie.css">
 </head>
 <body>
 
 <div class="center">
    <h3>Welcome to MovieMoose</h3>
 
    <p style="color: red;">${errorString}</p>
 
    <form method="POST" action="doLogin">
       <table border="0">
          <tr>
             <td>First Name:</td>
             <td><input type="text" name="firstName" value= "${user.firstName}" /> </td>
          </tr>
          <tr>
             <td>Last Name:</td>
             <td><input type="text" name="lastName" value= "${user.lastName}" /> </td>
          </tr>
          <tr>
             <td>ID:</td>
             <td><input type="text" name="id" value= "${user.id}" /> </td>
          </tr>
          <tr>
             <td colspan ="2">
                <input type="submit" value= "Submit" />
                <a href="${pageContext.request.contextPath}/" style="color:white;">Cancel</a>
             </td>
          </tr>
       </table>
    </form>
    </div>
 </body>
</html>