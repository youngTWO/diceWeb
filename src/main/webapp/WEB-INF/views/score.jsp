<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Score</title>
</head>
<body>
	Score page <br/>
	
	
	<c:forEach var="score" items="${score}">
		${score.playerName}: </t> ${score.win} win, </t> ${score.draw} draw, </t> ${score.lose} lose<br>
	</c:forEach>
	
	
	<input type="button" onclick="window.close();" value="Exit" />
	
</body>
</html>