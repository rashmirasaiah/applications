<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
<link href="/entry.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<h1>New Account Register Form</h1>
<div class="container">
<div class="modal-content animate">
<form action="/registration" method="post" enctype="multipart/form-data">
<label for="uid"><b>User ID </b></label> <br/><br/>			
<input class="glowing-border" type="text" name="userId" />	<br/><br/>  			
<label for="uname"><b>User Name </b></label>	<br/><br/>				
<input class="glowing-border" type="text" name="userName" />	<br/><br/>  				
<label for="password"><b>Password </b></label>	<br><br/>					
<input class="glowing-border" type="password" name="password" />	<br/><br/>  									
<button class="btn" type="submit"><b>Register</b></button></form>
</div>
</div>
</body>
</html>