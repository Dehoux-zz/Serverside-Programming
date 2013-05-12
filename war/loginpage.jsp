<html>
<head>

</head>
<body>
	<div id="account">
		<form action="LogServlet.do" method="post">
			<div id="messagebox">
				<%
					Object msgs = request.getAttribute("msgs");
					if (msgs != null) {
						out.println(msgs);
					}
				%>
			</div>
			<div id="inputbox">
				<input class="ltf" type="text" name="username" /><br /> <input
					class="ltf" type="password" name="password" /><br /> <input
					type="submit" name="login" value="Login!"  />
			</div>
		</form>
	</div>
	
	<a href="Register.jsp">Register</a>


</body>
</html>
