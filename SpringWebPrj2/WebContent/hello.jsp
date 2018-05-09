<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Log-in</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

</head>


<body>


	<div class="container">
		<h1 class="text-center">Log-in</h1>

		<table class="table table-bordered table table-hover">

			<tbody>

				<tr>
					<td colspan="20" class="text-center"><a href="getUserList.do">사용자
							목록</a></td>
				</tr>

			</tbody>
		</table>


		<form method="post" action="insertUser.do">
			<table class="table table-bordered table table-hover"
				class="text-center">

				<tr>
					<td class="text-center">ID :</td>
					<td><input type="text" name="userId" /></td>
				</tr>

				<tr>
					<td class="text-center">PW :</td>
					<td><input type="text" name="password" /></td>
				</tr>

				<tr>
					<td colspan="2" class="text-center"><input type="submit"
						value="Log-in" /></td>
				</tr>
				
				<tr>
					<td colspan="17" class="text-center"><a
						href="insertUserForm.do">회원가입</a></td>
				</tr>
			</table>
		</form>
	</div>



</body>
</html>