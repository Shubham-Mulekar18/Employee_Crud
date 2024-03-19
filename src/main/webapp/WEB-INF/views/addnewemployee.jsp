<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee</title>
<link href="<c:url value="/resources/CSS/style.css" />" rel="stylesheet">
<script src="<c:url value="/resources/JS/validation.js" />"></script>
</head>
<body>
<%@ include file="Bar.jsp" %>
<div class="form-div">
<center class="center">
<h2>Enter Employee Details</h2>
<br>
<form action="saveemp" method="POST">
<input type="text" name="name" placeholder="Enter name" id="name" onkeyup="validateName(this.value)" />
<br>
<span id="s"></span>
<br><br>
<input type="text" name="email" placeholder="Enter Email" id="email" onkeyup="emailValidate(this.value)" />
<br>
<span id="e"></span>
<br><br>
<input type="radio" name="gender" value="Male" /><label>Male</label> 
<input type="radio" name="gender" value="Female"/><label>Female</label>
<input type="radio" name="gender" value="Other"/><label>Other</label>
<br><br> 
<input type="text" name="contact" placeholder="Enter Contact" id="contact" onkeyup="validateContact(this.value)" />
<br>
<span id="c"></span>
<br><br>
<input type="text" name="cid" placeholder="Enter Company Id" id="cid" onkeyup="validateCompanyId(this.value)" />
<br>
<span id="Id"></span>
<br><br>
<input type="submit" name="s" value="Add New Employee" />
</form>
<br>
<h3>${m}</h3>
</center>
</div>
</body>
</html>