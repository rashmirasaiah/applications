<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bank Application Login Page</title>
<link href="/entry.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div id="id01" class="modal">
<div>
<h1>${errMsg}</h1>
</div>
<div class="container">
<form class="modal-content animate" method="post" action="/validateUser" enctype="multipart/form-data">  
<label for="uname"><b>User ID </b></label> 
<input class="glowing-border" id="name" type="text" name="userId" required/><br/><br/>  
<label for="password"><b>Password</b></label>
<input class="glowing-border" id="password" type="password" name="password" required/><br/><br/>  
<button class="btn" type="submit">Login</button>
</form>
<form method="post" action="/registerView">
<button class="btn" type="submit" ><b>New User Registration</b></button>
</form>
</div>
</div>

<script type="text/javascript">
		if (errMsg!=null) {
			document.getElementById("alert").style.display = "block";
		}
</script>


</body>
</html>