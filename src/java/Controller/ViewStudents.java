/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DataBase.MyConnection;
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

public class ViewStudents extends HttpServlet {

    public ViewStudents() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        List<Student> students = StudentData.getStudents();

        request.setAttribute("students", students);

        RequestDispatcher req = request.getRequestDispatcher("viewStudents.jsp");

        req.forward(request, response);



    }

}
