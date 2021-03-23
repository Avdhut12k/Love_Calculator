<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hi ${userName}</h1>

<form:form method="GET" action="result-email-page" modelAttribute="emailDTO">

Enter Your Email :<form:input path="email"/>

<input type = "submit" value="save">

</form:form>

</body>
</html>