<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<!-- TODO Use address object -->
<jsp:useBean id="address" scope="page" class="models.Address"></jsp:useBean>

<t:layout pageTitle="Addressdetails">
    <h1><jsp:getProperty name="address" property="name" /> <jsp:getProperty name="address" property="christianname" /></h1>
    <jsp:getProperty name="address" property="email" /> - <jsp:getProperty name="address" property="phone" /> - <jsp:getProperty name="address" property="mobile" /><br/>
    <jsp:getProperty name="address" property="country" />, <jsp:getProperty name="address" property="postcode" /> <jsp:getProperty name="address" property="city" /><br/>
    <jsp:getProperty name="address" property="street" />, <jsp:getProperty name="address" property="number" /><br/>
    <jsp:getProperty name="address" property="birthday" />
</t:layout>