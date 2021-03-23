 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign-In Here</title>
</head>
<body>

	<h1 align="center">Love Calculator</h1>
	<div align="center">
		<form:form action="saveSignInInfo" method="GET" modelAttribute="sign-In-Info">
			<label>Name : </label>
			<form:input id="name" path="name" /> 
			<br><br>  
			<label>Username : </label>
			<form:input  id="uname" path="userName" />
			 <br><br>  
			<label>Password : </label>
			<form:password  id="passwd" path="password" />
			<br><br>  
				Country :  
				<form:select  path="country">
				<form:option value="India" label="India"></form:option>
				<form:option value="USA" label="USA"></form:option>
				</form:select>
				

			<br><br>
				Hobbies : 
				Cricket<form:checkbox  path="hobby" value="Cricket"/>
				Reading<form:checkbox  path="hobby" value="Reading"/>
				Travel<form:checkbox  path="hobby" value="Travel"/>
				Programming<form:checkbox  path="hobby" value="Programming"/>
			<br><br>
				Gender :
				Male<form:radiobutton  path="gender" value="male"/>
				Female<form:radiobutton  path="gender" value="female"/>

			<br><br>
			<input type="submit" value="save">
		</form:form>

	</div>
</body>
</html>