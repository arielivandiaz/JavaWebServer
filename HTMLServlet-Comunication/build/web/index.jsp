<%-- 
    Document   : index
    Created on : 24/02/2018, 01:27:23
    Author     : Flash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Servlet - JSP Communication Demo</title>
</head>

<body>
    <%
        if(request.getAttribute("message") != null) {
            out.println("<h1>" + request.getAttribute("message") + "</h1>");
        }
    %>

    <form method="get" action="sayhello">
        <label for="name">Enter your name</label>
        <input type="text" name="name" id="name" />
        <input type="submit" value="Submit">
    </form>
</body>
</html>