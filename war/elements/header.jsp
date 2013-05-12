<%
	String title = "Serverside Programming 2.0";

	if (request.getParameterMap().containsKey("title")) {
		String sentTitle = request.getParameter("title");
		title = sentTitle + " - " + title;
	}
%>

<!DOCTYPE html>
<html>
	<head>		
		<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
		<title><%out.print(title);%></title>
		<link type="text/css" rel="stylesheet" href="elements/css/style.css" >
	</head>
	<body>
		<div id="page">
			<div id="topBar">
				<span>Serverside Programming 2.0</span>
			</div>
			<div id="menuBar">
				<ul>
					<li><a href="register.jsp">Registreren</a></li>
					<li><a href="login.jsp">Login</a></li>
				</ul>
			</div>
			<div id="content">