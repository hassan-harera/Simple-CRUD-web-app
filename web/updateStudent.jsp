<%-- 
    Document   : viewStudens
    Created on : Apr 30, 2020, 12:51:33 AM
    Author     : harera
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    
    <body>


        <%
            String uname = (String) request.getParameter("username");
            String fname = (String) request.getParameter("firstName");
            String lname = (String) request.getParameter("lastName");
        %>


        <form action="UpdateStudent" method="Get">



            <div class="inputFormBox">
                <h3 class="simpleFormLabel">First name</h3>
                <div class="inputFormPadding">
                    <input type="text" name="fname" value="<%= fname%>" required maxlength="40" placeholder="First name" />
                </div>
                <h3 class="simpleFormLabel">Last name</h3>
                <div class="inputFormPadding">
                    <input type="text" name="lname"  value="<%= lname%>" class="inputForm" required maxlength="40" placeholder="Last name" />
                </div>

                <h3 class="simpleFormLabel">Username</h3>
                <div class="inputFormPadding">
                    <input type="text" name="uname" value="<%= uname%>" required maxlength="40" placeholder="Username" />
                </div>
            </div>

            <input type="hidden" name="lastuname" value="<%=uname%>" />

            <br>
            <div class="simpleFormItem">
                <input type="submit" class="btn-primary-wide" value="Update">
            </div>

        </form>

    </body>
</html>
