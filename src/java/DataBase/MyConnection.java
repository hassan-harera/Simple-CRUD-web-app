
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author harera
 */
public class MyConnection {

    public static Connection con() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplecrudapplication?autoReconnect=true&useSSL=false", "root", "0000");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }

}
