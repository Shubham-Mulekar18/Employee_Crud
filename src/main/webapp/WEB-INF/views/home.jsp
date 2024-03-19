<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    <link href="<c:url value="/resources/CSS/style.css" />" rel="stylesheet">
    <script src="<c:url value="/resources/js/jquery.1.10.2.min.js" />"></script>
    </head>
    <body>
        <ul>
        <li><a href='addemp'>Add New Employee</a></li>
        <li><a href='addcmp'>Add New Company</a></li>
        <li><a href='viewemp'>View Employee Details</a></li>
        <li><a href='viewcmp'>View Company Details</a></li>
         <li><a href='search'>Search Employee</a></li>
        </ul>
    </body>
</html>
