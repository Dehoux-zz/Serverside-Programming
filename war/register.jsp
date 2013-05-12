<jsp:include page="elements/header.jsp"><jsp:param name="title" value="Register" /></jsp:include>
	<div id="account">
		<form action="RegisterServlet.do" method="post">
			<div id="inputbox">
				<input class="ltf" type="text" name="username" placeholder="Username"/><br /> 
				<input class="ltf" type="password" name="password" placeholder="Password"/>
				<input class="ltf" type="repassword" name="repassword" placeholder="Password"/><br /> 
				<input class="ltf" type="email" name="email" placeholder="E-mail"/>
				<input class="ltf" type="reemail" name="reemail" placeholder="E-mail"/><br /> 
				<input class="ltf" type="plaats" name="plaats" placeholder="Plaats"/><br /> 
				<input class="ltf" type="postcode" name="postcode" placeholder="Postcode"/><br /> 
				
				<input type="submit" name="register" value="Register"/>
			</div>
		</form>
	</div>

<%@	include file="elements/footer.jsp" %>