<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Company Details</title>
</head>
<body>
<%@ include file="Bar.jsp" %>
<center>
<h2>Company Details</h2>
<table border="3">

        <tr>
        <th>Cmp_Cid</th>
        <th>Cmp_Name</th>
        <th>Cmp_Position</th>
        <th>Update</th>
        <th>Delete</th>
        </tr>
        
    <c:forEach  var="a" items="${m}">
    <tr>
    	<td>${a.getCid()}</td>
    	<td>${a.getCname()}</td>
    	<td>${a.getPosition()}</td>
    	<td><a href='upCmp?cid=${a.getCid()}&cname=${a.getCname()}&position=${a.getPosition()}'>Update</a></td>
    	<td><a href='deleteCmp?cid=${a.getCid()}'>Delete</a></td>
    </tr>
    
    </c:forEach>
</table>
</center>
</body>
</html>