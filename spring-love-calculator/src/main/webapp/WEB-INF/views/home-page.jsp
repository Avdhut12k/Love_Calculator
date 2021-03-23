<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: "left";
	margin-left: 30px;
}
</style>

<script type="text/javascript">
	function nameValidation() {

		var uName = document.getElementById("un").value;
		if (uName.length < 2) {
			alert("your Name should have more than 2 characters");
			return false;
		} else
			return true;
	}
</script>

<meta charset="UTF-8">
<title>Love Calculator</title>
</head>
<body>

	<h1 align="center">Love Calculator</h1>
	
	<hr />
	
	<a href="sign-in-processing">SignIn</a>
	
	<form:form action="process-home-page" method="GET"
		modelAttribute="userInfo">
		<div align="center">
			<p>
				<label for="un">Your Name : </label>
				<form:input id="un" path="userName"
					placeholder="Type username here...." />
				<form:errors path="userName" cssClass="error"></form:errors>
			</p>
			<p>
				<label for="cn"> Crush Name : </label>
				<form:input type="text" id="cn" path="crushName"
					placeholder="Type Crushname here......." />
			</p>
			<p>
			<form:checkbox path="termAndConditions"/>
			<label>Please Agree our Terms And Conditions</label>
			<form:errors path = "termAndConditions" cssClass="error"></form:errors>
			</p>
			
			
			<input type="submit" value="Calculate" />
		</div>
	</form:form>
</body>
</html>