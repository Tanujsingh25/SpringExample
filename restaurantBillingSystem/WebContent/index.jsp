<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu Page</title>
</head>
<body>
	<h1>XYZ Restaurant</h1>
	<h2>Menu</h2>
	<f:form action="generateInvoice.obj" method="POST" modelAttribute="orderItem">
		<button type="submit" >Submit</button>
	</f:form>
</body>
</html>