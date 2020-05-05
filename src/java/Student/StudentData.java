package Student;

import DataBase.MyConnection;
import java.util.ArrayList;
import java.sql.*;
import java.util.List;

public class StudentData {

    public static List<Student> getStudents() {
        Connection con = MyConnection.con();

        List<Student> studnets = new ArrayList();
        PreparedStatement ps;
        String query = "select * from students;";
        try {
            ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                studnets.add(new Student(rs.getString("fname"), rs.getString("lname"), rs.getString("uname")));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return studnets;
    }

    public static Student getStudent(String uname) {
        Connection con = MyConnection.con();

        Student studnet = null;
        PreparedStatement ps;
        String query = "select * from students where uname = ?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, uname);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                studnet = new Student(rs.getString("fname"), rs.getString("lname"), rs.getString("uname"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return studnet;
    }

    public static Boolean insertStudent(String uname, String fname, String lname) {
        Connection con = MyConnection.con();

        PreparedStatement ps;
        String query = "insert into students values(?,?,?);";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, uname);
            ps.setString(2, fname);
            ps.setString(3, lname);
            return ps.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public static Boolean deleteStudent(String uname) {
        Connection con = MyConnection.con();

        PreparedStatement ps;
        String query = "delete from students where uname = ?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, uname);
            return ps.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

}