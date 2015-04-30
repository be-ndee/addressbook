import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Double;
import java.lang.Math;
import java.lang.Exception;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

public class Test extends HttpServlet {
    private PrintWriter out;

    @Override
    public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        this.out = response.getWriter();
        this.out.println("Get all names:\n");
        try {
            // Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch(ClassNotFoundException ex) {
            this.out.println("Error: unable to load driver class!");
            System.exit(1);
        } catch(IllegalAccessException ex) {
            this.out.println("Error: access problem while loading!");
            System.exit(2);
        } catch(InstantiationException ex) {
            this.out.println("Error: unable to instantiate driver!");
            System.exit(3);
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/addressbook?user=addressbook&password=addressbook");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM address;");
            while (rs.next()) {
                out.println(rs.getString("name"));
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            this.out.println("Error: sql error!");
        }
    }
}