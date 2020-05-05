package Controller;

import Student.StudentData;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author harera
 */

public class UpdateStudent extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String fname = (String) request.getParameter("fname");
        String lname = (String) request.getParameter("lname");
        String uname = (String) request.getParameter("uname");
        String lastuname = (String) request.getParameter("lastuname");

        StudentData.deleteStudent(lastuname);
        StudentData.insertStudent(uname, fname, lname);

        response.sendRedirect("ViewStudents");
    }

}
