<%-- 
    Document   : session_started
    Created on : Jun 13, 2024, 12:35:29 AM
    Author     : hacker2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Session started Page</title>
    </head>
    <body>
        <h1>Session started</h1>
        <p>
            Please enter your D below:
        </p>
        <form action="GenderServlet.do" method="post">
            <table>
                <tr>
                    <td>Gender: </td>
                    <td>
                        <select name="gender">
                            <option value="f">Female</option>
                            <option value="M">Male</option>
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
