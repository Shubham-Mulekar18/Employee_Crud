<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
</head>
<body>
<%@ include file="Bar.jsp" %>
<center>
<h2>Employee Details</h2>
<table border="3">
        <tr>
        <th>Emp_Id</th>
        <th>Emp_Name</th>
        <th>Emp_Email</th>
        <th>Emp_Gender</th>
        <th>Emp_Contact</th>
        <th>Cmp_Name</th>
        <th>Cmp_Position</th>
        <th>Update</th>
        <th>Delete</th>
        </tr>
        
    <c:forEach  var="a" items="${m}">
    <tr>
    	<td>${a.getId()}</td>
    	<td>${a.getName()}</td>
    	<td>${a.getEmail()}</td>
    	<td>${a.getGender()}</td>
    	<td>${a.getContact()}</td>
    	<td>${a.getCname()}</td>
    	<td>${a.getPosition()}</td>
    	<td><a href='up?id=${a.getId()}&name=${a.getName()}&email=${a.getEmail()}&gender=${a.getGender()}&contact=${a.getContact()}'>Update</a></td>
    	<td><a href='deleteEmp?id=${a.getId()}'>Delete</a></td>
    </tr>
    
    
    
    </c:forEach>
</table>
</center>
</body>
</html>