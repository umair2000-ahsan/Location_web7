<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Location</title>
</head>
<body>
<h1> Location |Create Location</h1>
<form action="savePage" method="post" >
Name:<input type="text" name="name"/><br>
Code:<input type="text"name="code"/><br>
Type:
Rural:<input type="radio" value="rural" name="type" >
Urban:<input type="radio" value="urban" name="type" >
<input type="submit" value="save">

</form>



${msg} 
</body>
</html>