import java.lang.Exception;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;


public class AddressList {

    public ArrayList<Address> addressList = new ArrayList<Address>();
    public tableName = Address.tableName;
    // Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    public Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/addressbook?user=addressbook&password=addressbook");

    public ArrayList<Address> getAll() throws Exception{
        Statement connStatement = conn.createStatement();
        ResultSet rs = connStatement.executeQuery("SELECT * FROM "+tableName+";");
        while (rs.next()) {
            // Making a temporary Addressobject to push into addressList
            Address address = new Address();
            address.fill(rs);
//            address.setChristianname = rs.getString("christianname");
//            address.setName = rs.getString("name");
//            address.setAddressform = rs.getString("addressform");
//            address.setEmail = rs.getString("email");
//            address.setPhone = rs.getString("phone");
//            address.setMobile = rs.getString("mobile");
//            address.setStreet = rs.getString("street");
//            address.setNumber = rs.getInt("number");
//            address.setCity = rs.getString("city");
//            address.setPostcode = rs.getString("postcode");
//            address.setCountry = rs.getString("country");
//            address.setBirthday = rs.getDate("birthday");

            addressList.add(address);
        }
        rs.close();
        connStatement.close();
        conn.close();

        return addressList;
    }

    public ArrayList<Address> getSearchResult(String column, String searchWord) throws Exception{
        PreparedStatement sqlStatementTemplate = conn.prepareStatement("SELECT * FROM " + tableName + " WHERE ? LIKE '%?%';");
        sqlStatementTemplate.setString(1,column);
        sqlStatementTemplate.setString(2,searchWord);

        ResultSet rs = sqlStatementTemplate.executeQuery();

        while (rs.next()) {
            // Making a temporary Addressobject to push into addressList
            Address address = new Address();
            address.fill(rs);
//            address.setChristianname = rs.getString("christianname");
//            address.setName = rs.getString("name");
//            address.setAddressform = rs.getString("addressform");
//            address.setEmail = rs.getString("email");
//            address.setPhone = rs.getString("phone");
//            address.setMobile = rs.getString("mobile");
//            address.setStreet = rs.getString("street");
//            address.setNumber = rs.getInt("number");
//            address.setCity = rs.getString("city");
//            address.setPostcode = rs.getString("postcode");
//            address.setCountry = rs.getString("country");
//            address.setBirthday = rs.getDate("birthday");

            addressList.add(address);
        }
        rs.close();
        sqlStatementTemplate.close();
        conn.close();

        return addressList;
    }

    public void deleteAddress(ArrayList<Address> addresses) throws Exception{
        Statement connStatement = conn.createStatement();
        ResultSet rs = connStatement.executeUpdate("DELETE * FROM " + tableName + "WHERE id in"+extractIdsfromAddresses(addresses)+";");

        while (rs.next()) {
            // Making a temporary Addressobject to push into addressList
            Address temp = new Address();
            temp.setId = rs.getInt("id");
            temp.setChristianname = rs.getString("christianname");
            temp.setName = rs.getString("name");
            temp.setAddressform = rs.getString("addressform");
            temp.setEmail = rs.getString("email");
            temp.setPhone = rs.getString("phone");
            temp.setMobile = rs.getString("mobile");
            temp.setStreet = rs.getString("street");
            temp.setNumber = rs.getInt("number");
            temp.setCity = rs.getString("city");
            temp.setPostcode = rs.getString("postcode");
            temp.setCountry = rs.getString("country");
            temp.setBirthday = rs.getDate("birthday");

            addressList.add(temp);
        }
        rs.close();
        sqlStatementTemplate.close();
        conn.close();
    }

    public String extractIdsfromAddresses(ArrayList<Address> addresses){
        String result = "( ";
        for (address : addresses){
            result += address.getId+",";
        }
        //Remove last comma
        result.substring(0, result.length()-1);
        result += ");";
        return result;
    }

}