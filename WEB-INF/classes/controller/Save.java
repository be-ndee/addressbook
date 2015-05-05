package controller;

import java.io.IOException;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Address;
import java.sql.Date;
import java.util.Calendar;

public class Save extends HttpServlet {
    @Override
    public void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));

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

        int birthdayDate = Integer.parseInt(request.getParameter("birthdayDate"));
        int birthdayMonth = Integer.parseInt(request.getParameter("birthdayMonth"));
        int birthdayYear = Integer.parseInt(request.getParameter("birthdayYear"));
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(birthdayYear, birthdayMonth, birthdayDate);
        Date birthday = new Date(calendar.getTimeInMillis());

        Address address = new Address();
        // TODO fetch existing address
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
    }
}