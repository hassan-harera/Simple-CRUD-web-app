<%-- 
    Document   : viewStudens
    Created on : Apr 30, 2020, 12:51:33 AM
    Author     : harera
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <body>

        <form action="CreateStudent" method="Get">
            
            <div class="inputFormBox">
                <h3 class="simpleFormLabel">First name</h3>
                <div class="inputFormPadding">
                    <input type="text" name="fname" maxlength="40" placeholder="First name" required />
                </div> 
                <h3 class="simpleFormLabel">Last name</h3>
                <div class="inputFormPadding">
                    <input type="text" name="lname" required maxlength="40" placeholder="Last name" />
                </div>

                <h3 class="simpleFormLabel">Username</h3>
                <div class="inputFormPadding">
                    <input type="text" name="uname" required maxlength="40" placeholder="Username" />
                </div>
            </div>

            <br>
            <div class="simpleFormItem">
                <input type="submit" class="btn-primary-wide" >
            </div>

        </form>

    </body>
</html>
