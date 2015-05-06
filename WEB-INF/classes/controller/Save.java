package controller;

import java.io.IOException;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Address;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Save extends HttpServlet {
    @Override
    public void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = 0;
        if (request.getParameter("id") != null) {
            id = Integer.parseInt(request.getParameter("id"));
        }

        try {
            String name = request.getParameter("name");
            String christianname = request.getParameter("christianname");

            String addressform = request.getParameter("addressform");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String mobile = request.getParameter("mobile");
            String street = request.getParameter("street");
            
            int number = Integer.parseInt(request.getParameter("number"));

            String city = request.getParameter("city");
            String postcode = request.getParameter("postcode");
            String country = request.getParameter("country");

            // create birthday
            Date birthday;

            int birthdayDate = Integer.parseInt(request.getParameter("birthdayDate"));
            int birthdayMonth = Integer.parseInt(request.getParameter("birthdayMonth"));
            int birthdayYear = Integer.parseInt(request.getParameter("birthdayYear"));

            Calendar calendar = Calendar.getInstance();
            calendar.set(birthdayYear, birthdayMonth-1, birthdayDate);
            birthday = new Date(calendar.getTimeInMillis());

            // create address with attributes
            Address address = new Address();
        
            if (id != 0) {
                // TODO fetch existing address
            }
            address.setName(name);
            address.setChristianname(christianname);

            address.setAddressform(addressform);
            address.setEmail(email);
            address.setPhone(phone);
            address.setMobile(mobile);
            address.setStreet(street);

            address.setNumber(number);

            address.setCity(city);
            address.setPostcode(postcode);
            address.setCountry(country);

            address.setBirthday(birthday);

            address.save();
        } catch (Exception ex) {
            // TODO Invalid print to user
            response.getWriter().write("Invalid parameters");
            response.getWriter().write(ex.getMessage());
        }
    }
}