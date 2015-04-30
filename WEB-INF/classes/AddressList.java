import java.lang.Exception;
import java.sql.*;


public class AddressList {

    private ArrayList<Address>;

    private getAll(){
            // Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/addressbook?user=addressbook&password=addressbook");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM address;");
            while (rs.next()) {
                Address temp = new Address();
                temp.setName = rs.getString("christianname");
                temp.setName = rs.getString("name");
                temp.setName = rs.getString("christianname");
                temp.setName = rs.getString("christianname");
                temp.setName = rs.getString("christianname");
                temp.setName = rs.getString("christianname");
                temp.setName = rs.getString("christianname");
                temp.setName = rs.getString("christianname");
                temp.setName = rs.getString("christianname");
                temp.setName = rs.getString("christianname");
                temp.setName = rs.getString("christianname");
                temp.setName = rs.getString("christianname");

                out.println(rs.getString("name"));
            }
            rs.close();
            stmt.close();
            conn.close();
    }
}