<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="insert.servlet1?comm=ins" method="post" accept-charset="UTF-8">	
		<table>
			<tr>				
				<td><input type="text" name="id" placeholder="아이디"></td>
			</tr>			
			<tr>				
				<td><input type="password" name="passwd" placeholder="비밀번호"></td>
			</tr>			
			<tr>				
				<td><input type="text" name="name" placeholder="이름"></td>
			</tr>			
			<tr>				
				<td><input type="text" name="year" placeholder="입학년도"></td>
			</tr>			
			<tr>				
				<td><input type="text" name="snum" placeholder="학번"></td>
			</tr>			
			<tr>				
				<td><input type="text" name="depart" placeholder="전공"></td>
			</tr>			
			<tr>				
				<td><input type="text" name="mobile1" placeholder="전화번호1"></td>
			</tr>			
			<tr>				
				<td><input type="text" name="mobile2" placeholder="전화번호2"></td>
			</tr>			
			<tr>				
				<td><input type="text" name="address" placeholder="주소"></td>
			</tr>			
			<tr>				
				<td><input type="text" name="email" placeholder="이메일"></td>
			</tr>
			<tr>				
				<td><input type="submit" value="전송"></td>
			</tr>
		</table>
	</form>
</body>
</html>