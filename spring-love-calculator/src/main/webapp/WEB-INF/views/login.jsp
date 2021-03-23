<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.pos {
	position: fixed;
}
</style>
<script type="text/javascript">
	function validate() {
		var logInName = document.getElementById("logInId").value;
		var passwd = document.getElementById("passwd").value;
		if (logInName.length < 3) {
			alert("Username should required more than 3 characters(e.g.Mom)");
			return false;
		} else {
			if (logInName.indexOf(' ') >= 0) {
				alert("Username doesn't contain space");
				return false;
			} else {
				if (logInName.length > 6) {
					alert("Username is not more than 6-characters");
					return false;
				} else {
					if (passwd.length < 6) {
						alert("password should contains 7 to 15 characters which contain at least one numeric digit and a special character");

						return false;
					} else {
						var passw = /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{7,15}$/;
						if (passwd.match(passw)) {
							return true;
						} else {
							alert("password should contains 7 to 15 characters which contain at least one numeric digit and a special character");

							return false;
						}
					}

				}
			}

		}

	}
</script>



<meta charset="UTF-8">
<title>Please LogIn</title>
</head>
<body>
	<h1 align="center">Hi Please Log-In to Our App</h1>
	<div align="right">
		<a href="register">Register</a>
	</div>
	<div align="center">
		<form action="processLogin" method="post" onsubmit="return validate()">
			<label for="logInId">Username : </label> <input type="text"
				name="logInName" id="logInId"><br /> <br /> <label
				for="password">Password : </label> <input type="password"
				name="password" id="passwd"><br /> <br />
				<div align="center">
				<a href="Forget_Password">Forgot Password</a>			
				
				<input type="submit" value="Login">
			</div>

		</form>
	</div>
</body>
</html>