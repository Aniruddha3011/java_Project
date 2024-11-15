// Data base connection (mysql)

package bank.management.system;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    public Conn() {
        try {
            // Correct URL format for local MySQL connection
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "Aniruddha@3011");
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
}
}