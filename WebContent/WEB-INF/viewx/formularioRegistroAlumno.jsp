<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro de Estudiantes</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/css/styles2.css"><link>
</head>
<body>

	<form:form action="procesarFormulario" modelAttribute="estudianteX">
	
	Nombre: <form:input path="nombre"/>
	
	<br><br>
	
	Apellidos: <form:input path="apellidos"/>
	
	<br><br>
	
	<input type="submit" value="Enviar">
	
	</form:form>

</body>
</html>