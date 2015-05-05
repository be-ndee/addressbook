<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<!-- TODO Use address object -->
<jsp:useBean id="address" scope="page" class="models.Address"></jsp:useBean>

<t:layout pageTitle="Addressdetails">
    <h1 class="col-xs-12"><jsp:getProperty name="address" property="name" /> <jsp:getProperty name="address" property="christianname" /></h1>
    <ul class="list-group col-xs-12">
        <li class="list-group-item">
            <a href="#" class="btn btn-primary btn-xs glyphicon glyphicon-pencil"></a>
            <a href="#" class="btn btn-danger btn-xs glyphicon glyphicon-trash"></a>
        </li>
        <li class="list-group-item"><span class="glyphicon glyphicon-envelope"></span> <jsp:getProperty name="address" property="email" /></li>
        <li class="list-group-item"><span class="glyphicon glyphicon-phone"></span> <jsp:getProperty name="address" property="mobile" /></li>
        <li class="list-group-item"><span class="glyphicon glyphicon-phone-alt"></span> <jsp:getProperty name="address" property="phone" /></li>
        <li class="list-group-item"><span class="glyphicon glyphicon-home"></span> <jsp:getProperty name="address" property="street" /> 
            <jsp:getProperty name="address" property="number" />, 
            <jsp:getProperty name="address" property="postcode" /> 
            <jsp:getProperty name="address" property="city" />, 
            <jsp:getProperty name="address" property="country" /></li>
        <li class="list-group-item"><span class="glyphicon glyphicon-calendar"></span> <jsp:getProperty name="address" property="birthday" /></li>
    </ul>
</t:layout>