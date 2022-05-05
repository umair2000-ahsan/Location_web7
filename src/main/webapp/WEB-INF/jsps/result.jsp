<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List All Data</title>
</head>
<body>
	<h2> List All Location</h2>
 		<table>
 		 	<tr>
 		 		<th>NAME</th>
 		 		<th>CODE</th>
 		 		<th>TYPE</th>
 		 		<th> DELETE</th>
 		 	
 		 	</tr>
	<c:forEach  items="${location}" var="location">
		<tr> 
			<td> ${location.name}</td>
			<td> ${location.code}</td>
			<td> ${location.type}</td>
			<td> <a href="delete?id=${location.id}">delete</a> </td>
		</tr>
	
	
	</c:forEach>
 	</table>
</body>
</html>