<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="http://localhost:80/css/main.css">
<title>Rahul's Web Portal</title>
<script src ="http://localhost:80/js/main.js">
</script>
</head>
<body>
	<h1>Welcome to the Rahul Shah's Web Portal..!</h1>
	<hr/>
	<div>
	<ul>
		<li> <a href="#home"	 id="id_home"  onClick='changePage(event);' class="active">Home</a></li>
		<li><a href=#blog 		id="id_blog" 	onClick='changePage(event);'>Blog</a></li>
		<li><a href="#ideas" 	id="id_ideas" 	onClick='changePage(event);'>Ideas</a></li>
		<li><a href="#photos"	 id="id_photo" onClick='changePage(event);' >Photos</a></li>
		<li><a href="#persoal" 	id="id_personal" onClick='changePage(event);'>Personal</a></li>
		<li><a href="#about"	 id="id_about" onClick='changePage(event);'>About</a></li>
	</ul>
	</div>
	<div class="login">
		<a href="#login" id="id_login" onClick='setNewPage(event);'>login</a>
		<a href=#register>Register</a>
	</div>
	
	<div>
		<iframe id="anchor" src = "" ></iframe>
	</div>
</body>
</html>