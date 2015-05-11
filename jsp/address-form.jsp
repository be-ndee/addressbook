<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="fg" tagdir="/WEB-INF/tags/form/form-group" %>

<!-- TODO Use address object -->
<jsp:useBean id="address" scope="page" class="models.Address"></jsp:useBean>

<t:layout pageTitle="Address form">
    <form class="form-horizontal" action="/addressbook/save" method="POST">
        <fg:hidden property="id" value="${address.id}"></fg:hidden>
        <fg:select property="addressform" text="Addressform">
            <fg:option text="-" value=""></fg:option>
            <fg:option text="Herr" value="herr"></fg:option>
            <fg:option text="Frau" value="frau"></fg:option>
        </fg:select>
        <fg:text property="name" text="Name" value="${address.name}"></fg:text>
        <fg:text property="christianname" text="Christianname" value="${address.christianname}"></fg:text>
        <fg:text property="email" text="Email" value="${address.email}"></fg:text>
        <fg:text property="phone" text="Phone" value="${address.phone}"></fg:text>
        <fg:text property="mobile" text="Mobile" value="${address.mobile}"></fg:text>
        <fg:text property="country" text="Country" value="${address.country}"></fg:text>
        <fg:text property="postcode" text="Postcode" value="${address.postcode}"></fg:text>
        <fg:text property="city" text="City" value="${address.city}"></fg:text>
        <fg:text property="street" text="Street" value="${address.street}"></fg:text>
        <fg:number property="number" text="Number" value="${address.number}"></fg:number>
        <fg:number property="birthdayDate" text="Birth Day" value="${address.birthday}"></fg:number>
        <fg:number property="birthdayMonth" text="Birth Month" value="${address.birthday}"></fg:number>
        <fg:number property="birthdayYear" text="Birth Year" value="${address.birthday}"></fg:number>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Save</button>
            </div>
        </div>
    </form>
</t:layout>