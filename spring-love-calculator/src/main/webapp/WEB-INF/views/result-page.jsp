<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Here is your Result......</title>
</head>
<body>

<h1>YOur Result is predicated</h1>
<p>

${userInfo.userName} and ${userInfo.crushName} are
<label>FRIEND</label>
</p>

<!-- /spring-love-calculator/show-email-page/?userName=${userInfo.userName} scenerio for the query string -->


<a href = "/spring-love-calculator/show-email-page">Send Result to Your Email</a>

</body>
</html>