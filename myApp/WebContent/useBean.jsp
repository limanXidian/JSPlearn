<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>useBean</title>
</head>
<body>
	<jsp:useBean id="today" class="java.util.Date"/>
	<%=today %>
	<c:forEach var="x" begin="1" end="5">
		<c:out value="${x}"/>
	</c:forEach>
</body>
</html>