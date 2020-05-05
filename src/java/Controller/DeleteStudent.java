package Controller;

import Student.Student;
import Student.StudentData;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author harera
 */

public class DeleteStudent extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String uname = (String) request.getParameter("username");
        
        StudentData.deleteStudent(uname);
        
        response.sendRedirect("ViewStudents");
        
    }

}
