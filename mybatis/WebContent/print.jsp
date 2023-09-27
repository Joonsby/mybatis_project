<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="com.jslee.userinfo.Info"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
table {
	border-collapse: collapse
}

th{
background:#ececec;
}

th, td {
	border: 1px solid #000;
	text-align:center;
	padding:5px;
}
</style>
<body>
	<table>
		<thead>
			<tr>
				<th>아이디</th>
				<th>비밀번호</th>
				<th>이름</th>
				<th>입학 연도</th>
				<th>학번</th>
				<th>전공</th>
				<th>전화번호1</th>
				<th>전화번호2</th>
				<th>주소</th>
				<th>이메일</th>
			</tr>
		</thead>
		<tbody>
			<%
				List<Info> info = (List<Info>) request.getAttribute("list");
				for (int i = 0; i < info.size(); i++) {
					out.println("<tr>");
					out.println("<td>" + info.get(i).getId() + "</td>");
					out.println("<td>" + info.get(i).getPasswd() + "</td>");
					out.println("<td>" + info.get(i).getName() + "</td>");
					out.println("<td>" + info.get(i).getYear() + "</td>");
					out.println("<td>" + info.get(i).getSnum() + "</td>");
					out.println("<td>" + info.get(i).getDepart() + "</td>");
					out.println("<td>" + info.get(i).getMobile1() + "</td>");
					out.println("<td>" + info.get(i).getMobile2() + "</td>");
					out.println("<td>" + info.get(i).getAddress() + "</td>");
					out.println("<td>" + info.get(i).getEmail() + "</td>");
				}
			%>
		</tbody>
	</table>
</body>
</html>