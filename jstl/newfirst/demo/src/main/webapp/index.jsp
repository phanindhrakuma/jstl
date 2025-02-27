<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    <%@ page isELIgnored = "false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Multiplication tables</title>
<%@ page isELIgnored = "false" %>
</head>
<body bgcolor="cyan">

    <c:out value="helloo"/> 
    <c:set var="str" value="i am phani"/>
    Length : $(str)

    <% int name = 12;
    name = name*name;

    out.println(name); %>
</body>
</html>