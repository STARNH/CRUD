<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="u"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="success">
<h4 align="center">
****************WELCOME TO SUCCESS PAGE*****************
<table style="width: 80%">
<tr>
<th>Name:</th>
<th>City:</th>
<th>Username:</th>
<th>Password:</th>
</tr>
<tr>
<u:forEach items="${data}"></u:forEach>

<td></td>

</tr>



<tr></tr>


</table>
</h4>
</form>




</body>
</html>