<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Company</title>
<link href="<c:url value="/resources/CSS/style.css" />" rel="stylesheet">
<script src="<c:url value="/resources/JS/validation.js" />"></script>
</head>
<body>
<%@ include file="Bar.jsp" %>
<div class="form-div">
<center class="center">
<h2>Enter Company Details</h2>
<br>
<form action="savecmp" method="POST">
<input type="text" name="cname" placeholder="Enter name" id="name" onkeyup="validateName(this.value)" />
<br>
<span id="s"></span>
<br><br>
<div>
        <label for='position'>Choose Position</label>
        	<select name='position'>
            	<option value=''>--Please choose Position--</option>
            	<option value='Human Resource'>Human Resource</option>
            	<option value='Java Developer'>Java Developer</option>
            	<option value='Testing'>Testing</option>
            	<option value='Devops'>Devops</option>
            	<option value='Quality Assurance'>Quality Assurance</option>
            	<option value='Data Analytics'>Data Analytics</option>
            	<option value='Python Developer'>Python Developer</option>
            	<option value='UI/UX Designer'>UI/UX Designer</option>
        	</select>
</div>
<input type="submit" name="s" value="Add New Company" />
</form>
<br>
<h3>${m}</h3>
</center>
</div>
</body>
</html>