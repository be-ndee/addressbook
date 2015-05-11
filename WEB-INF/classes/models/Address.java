package models;

import java.text.SimpleDateFormat;
import java.lang.Exception;
import java.sql.*;

public class Address {
    public static final String tableName = "address";

    // fields
    private int id = 0;
    private String name;
    private String christianname;
    
    private String addressform;
    private String email;
    private String phone;
    private String mobile;
    private String street;

    private int number;

    private String city;
    private String postcode;
    private String country;

    private Date birthday;

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getChristianname() {
        return this.christianname;
    }

    public String getAddressform() {
        return this.addressform;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getStreet() {
        return this.street;
    }

    public int getNumber() {
        return this.number;
    }

    public String getCity() {
        return this.city;
    }

    public String getPostcode() {
        return this.postcode;
    }

    public String getCountry() {
        return this.country;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    private void setId (int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChristianname(String christianname) {
        this.christianname = christianname;
    }

    public void setAddressform(String addressform) {
        this.addressform = addressform;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Address () {
    }

    // Save the bean to the database
    public void save () throws Exception {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/addressbook?user=addressbook&password=addressbook");
        
        PreparedStatement statement;
        if (this.id == 0) {
            // insert
            statement = connection.prepareStatement("INSERT INTO " + this.tableName + " (name, christianname, addressform, email, phone, mobile, street, number, city, postcode, country, birthday) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);", Statement.RETURN_GENERATED_KEYS);
        } else {
            // update
            statement = connection.prepareStatement("UPDATE " + this.tableName + " SET name=?, christianname=?, addressform=?, email=?, phone=?, mobile=?, street=?, number=?, city=?, postcode=?, country=?, birthday=? WHERE id=" + Integer.toString(this.id) + ";");
        }
        statement.setString(1, this.name);
        statement.setString(2, this.christianname);
        statement.setString(3, this.addressform);
        statement.setString(4, this.email);
        statement.setString(5, this.phone);
        statement.setString(6, this.mobile);
        statement.setString(7, this.street);
        statement.setString(8, Integer.toString(this.number));
        statement.setString(9, this.city);
        statement.setString(10, this.postcode);
        statement.setString(11, this.country);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        statement.setString(12, format.format(this.birthday));

        int affectedRows = statement.executeUpdate();
        // set the id
        if (this.id == 0) {
            if (affectedRows == 0) {
                throw new SQLException("Insert failed, no rows affected.");
            }
            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                this.setId(generatedKeys.getInt(1));
            } else {
                throw new SQLException("Insert failed, no ID obtained.");
            }
            generatedKeys.close();
        }

        statement.close();
        connection.close();
    }

    public void fill (ResultSet resultSet) {

    }

    // Fill this object with the data for the address-id
    public void read (int id) throws Exception {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/addressbook?user=addressbook&password=addressbook");
        
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM " + this.tableName + " WHERE id=" + id + ";");

        if (resultSet.next()) {
            this.setId(id);
            this.setName(resultSet.getString("name"));
            this.setChristianname(resultSet.getString("christianname"));
            this.setAddressform(resultSet.getString("addressform"));
            this.setEmail(resultSet.getString("email"));
            this.setPhone(resultSet.getString("phone"));
            this.setMobile(resultSet.getString("mobile"));
            this.setStreet(resultSet.getString("street"));
            this.setNumber(resultSet.getInt("number"));
            this.setCity(resultSet.getString("city"));
            this.setPostcode(resultSet.getString("postcode"));
            this.setCountry(resultSet.getString("country"));
            this.setBirthday(resultSet.getDate("birthday"));
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
}