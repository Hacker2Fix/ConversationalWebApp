<%-- 
    Document   : start.jsp
    Created on : Jun 13, 2024, 12:22:30 AM
    Author     : hacker2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Start Page</title>
    </head>
    <body>
        <h1>Start</h1>
        <p>
            Please enter your D below:
        </p>
        <form action="StartServlet.do" method="post">
            <table>
                <tr>
                    <td>Name: </td>
                    <td><input type="text" name="name" required=""/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Enter"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
