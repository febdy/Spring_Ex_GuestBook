<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>GuestBook3</title>
</head>
<body>
	<form action="gbc" method="post">
		<table border=1 width=500>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name"></td>
				<td>비밀번호</td>
				<td><input type="password" name="pass"></td>
				<td><input type="hidden" name="a" value="add"></td>
			</tr>
			<tr>
				<td colspan=4><textarea name="content" cols=60 rows=5></textarea></td>
			</tr>
			<tr>
				<td colspan=4 align=right><input type="submit" VALUE=" 확인 "></td>
			</tr>
		</table>
	</form>
	<br />

	
		<table width=510 border=1>
			<tr>
				<td>번호</td>
				<td>이름</td>
				<td>날짜</td>
				<td><a href="gbc?a=deleteform&no=">삭제</a></td>
			</tr>
			<tr>
				<td colspan=4>내용</td>
			</tr>
		</table>
		<br />

</body>
</html>