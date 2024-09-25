package university.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection c;
    Statement s;

    Conn() {
        try {
            // Register the JDBC driver (this line is correct)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create a connection
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagement", "root", "mysqlrutuja");

            // Create a statement
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
