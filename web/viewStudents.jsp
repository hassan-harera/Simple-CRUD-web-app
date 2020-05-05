<%-- 
    Document   : viewStudents
    Created on : May 4, 2020, 8:42:42 PM
    Author     : harera
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>




    <body>

        <h1>
            Student CRUD APP
        </h1>

        <form action="createStudent.jsp">
            <input type="submit" class="btn-primary-wide" value="Create student">
        </form>

        <br>

        <table border="1">
            <tr>
                <th> First Name </th>
                <th> Last Name </th>
                <th> Username </th>
                <th> Action </th>
            </tr>

            <c:forEach var="student" items="${students}">
                <tr>
                    <td> ${student.firstName} </td>
                    <td> ${student.lastName} </td>
                    <td> ${student.username} </td>
                    <td> <form action="DeleteStudent">
                            <input type="hidden" name="username" value="${student.username}" />
                            <input type="submit" class="btn-primary-wide" value=" delete">
                        </form>
                        <form action="updateStudent.jsp">
                            <input type="hidden" name="username" value="${student.username}" />
                            <input type="hidden" name="firstName" value="${student.firstName}" />
                            <input type="hidden" name="lastName" value="${student.lastName}" />
                            <input type="submit" class="btn-primary-wide" value="update">
                        </form>
                </tr>
            </c:forEach>

        </table>        




    </body>
</html>
