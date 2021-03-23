<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Information Saved Successfully</title>
</head>
<body>

<p>Your Name is : ${signInfo.name}</p><br>
Username : ${signInfo.userName} <br>

Country : ${signInfo.country} <br>

Gender : ${signInfo.gender} <br>

Hobbies :
<ul>

<c:forEach var="hobby" items="${signInfo.hobby}">
<li>${hobby}</li>
</c:forEach>


</ul>






</body>
</html>