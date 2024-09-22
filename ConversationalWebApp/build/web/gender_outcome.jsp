<%-- 
    Document   : gender_outcome
    Created on : Jun 13, 2024, 12:54:49 AM
    Author     : hacker2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gender outcome Page</title>
    </head>
    <body>
        <h1>Gender outcome</h1>
        <%
            String n =(String) session.getAttribute("name");
            String t =(String) session.getAttribute("t");
        %>
        <p>
            Hi <b><%=t%></b> <b><%=n%></b>.
        </p>
        <form action="TeamServlet.do" method="post">
            <table>
                <tr>
                    <td>Team: </td>
                    <td>
                        <select name="team">
                            <option value="s">Sundows</option>
                            <option value="o">Others</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Enter"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
