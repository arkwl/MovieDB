<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
    <meta charset="UTF-8">
    <title>User Info</title>
    <link rel="stylesheet" type="text/css" href="css/movie.css">
 </head>
 <body> 
 
 <div class="center">
    <h3>Hello, ${user.firstName} ${user.lastName}!</h3>
 
    ID: <b>${user.id}</b>
    <br />
    User Level: ${user.userLevel}
    <br />
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <c:set var="thisUser" value="${user}" />
    
    <c:choose>
    	<c:when test="${user.userLevel eq 'manager'}">
        	<p>Manager Options </p>
        	<%@ include file="manager.jsp"%>
    	</c:when>
    	<c:when test="${user.userLevel eq 'customer'}">
        	<p>Customer Options </p>
        	<%@ include file="customer.jsp"%>
    	</c:when>
    	<c:when test="${user.userLevel eq 'employee'}">
        	<p>Employee Options</p>
        	<%@ include file="employee.jsp"%>
    	</c:when>
    	<c:otherwise>
        	<p>Status ${statut} not found</p>
    	</c:otherwise>
	</c:choose>
	<form action="${pageContext.request.contextPath}/transaction" method="POST">
		<button type="submit" name="button" value="home">Home</button>
	</form>
	<form action="${pageContext.request.contextPath}/transaction" method="POST">
			<button type="submit" name="button" value="help">Help</button>
		</form>
 </div>
 </body>
</html>