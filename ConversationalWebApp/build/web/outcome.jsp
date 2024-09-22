<%-- 
    Document   : outcome
    Created on : Jun 13, 2024, 1:16:35 AM
    Author     : hacker2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcome Page</title>
    </head>
    <body>
        <h1>Outcome</h1>
        <%
            String n = (String) session.getAttribute("name");
            String t = (String) session.getAttribute("t");
            String cn = pageContext.getServletContext().getInitParameter("cn");
            String c = (String)request.getAttribute("c");
        %>
        <p>
            Hello <b><%=t%></b> <b><%=n%></b>, this is <b><%=cn%></b>.
        </p>
        <p>
            <b><%=c%></b>.
        </p>
        <p>Click <a href="EndSessionServlet.do">here</a> to end the session.</p>
    </body>
</html>
