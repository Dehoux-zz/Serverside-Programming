<jsp:include page="elements/header.jsp"><jsp:param name="title" value="Register" /></jsp:include>

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
	
<%@	include file="elements/footer.jsp" %>