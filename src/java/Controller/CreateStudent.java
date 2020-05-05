/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Student.Student;
import Student.StudentData;
import java.io.IOException;
import java.io.PrintWriter;
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

public class CreateStudent extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fname = (String) request.getParameter("fname");
        String lname = (String) request.getParameter("lname");
        String uname = (String) request.getParameter("uname");
        
        StudentData.insertStudent(uname, fname, lname);
        
        response.sendRedirect("ViewStudents");
        
    }
}