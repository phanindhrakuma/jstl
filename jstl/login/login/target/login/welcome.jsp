<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="javax.servlet.http.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
</head>
<body>
       
           if(session.getAttribute("username")==null){
            response.sendRedirect("index.jsp");
           }
           <br>
    welcome... ${username}


    <a href="videos.jsp"> videos here</a>

    <form action="logout">
        <input type="submit" value="logout.">
    </form>
</body>
</html>