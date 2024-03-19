<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee</title>
<link href="<c:url value="/resources/CSS/style.css" />" rel="stylesheet">
<script src="<c:url value="/resources/JS/validation.js" />"></script>
</head>
<body>
	<%@ include file="Bar.jsp"%>
	<div class="form-div">
		<center class="center">
			<h2>Update Employee Details</h2>
			<br>
			<form action='xupdateEmp' method='POST'>
			<input type="hidden" name="id" value='${id}'/>
				<input type="text" name="name" value='${name}' placeholder="Enter name" id="name"
					onkeyup="validateName(this.value)" /> <br> <span id="s"></span>
				<br>
				<br> <input type="text" name="email" value='${email}' placeholder="Enter Email"
					id="email" onkeyup="emailValidate(this.value)" /> <br> <span
					id="e"></span> <br>
				<br>
				<c:choose>
					<c:when test="${gender=='Male'}">
						<input type="radio" name="gender" value='Male' checked="checked" />
						<label>Male</label>
					</c:when>
					<c:otherwise>
						<input type="radio" name="gender" value='Male' />
						<label>Male</label>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${gender=='Female'}">
						<input type="radio" name="gender" value='Female' checked="checked" />
						<label>Female</label>
					</c:when>
					<c:otherwise>
						<input type="radio" name="gender" value='Female' />
						<label>Female</label>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${gender=='Other'}">
						<input type="radio" name="gender" value='Other' checked="checked" />
						<label>Other</label>
					</c:when>
					<c:otherwise>
						<input type="radio" name="gender" value='Other' />
						<label>Other</label>
					</c:otherwise>
				</c:choose>
				<br><br>
				<input type="text" name="contact" value='${contact}' placeholder="Enter Contact"
					id="contact" onkeyup="validateContact(this.value)" /> <br> <span
					id="c"></span> <br>
				<br> <input type="submit" name="s" value="Update Employee" />
			</form>
			<br>
			<h3>${m}</h3>
		</center>
	</div>
</body>
</html>