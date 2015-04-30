import java.util.Date;
import java.text.SimpleDateFormat;
import java.lang.Exception;
import java.sql.*;

public class Address {
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

    public Address () {
    }

    public void save () throws Exception {
        // id != null -> edit
    }


}