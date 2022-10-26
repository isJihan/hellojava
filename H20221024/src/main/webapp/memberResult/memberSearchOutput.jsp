<%@page import="co.edu.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세정보처리결과(memberSearchOutput.jsp)</title>
</head>
<body>
	<%
	MemberVO result = (MemberVO) request.getAttribute("memberInfo");
	%>
	<h3>회원상세정보 보기</h3>
	<% if (result != null){ %>
		<p>회원아이디 : <%=result.getId()%> </p>
		<p>회원이름 : <%=result.getName()%> </p>
		<p>회원이메일 : <%=result.getEmail()%></p>
	<%}else{ %>
	<p>조회된 정보가 없습니다!!!</p>
	<%} %>
	
	<input type= "button" value="메인화면" onClick="location.href='http://localhost:8081/H20221024/'">
</body>
</html>