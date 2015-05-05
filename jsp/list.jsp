<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout pageTitle="Addresslist">
    <table class="table">
        <thead>
            <tr>
                <th>Name</th>
                <th>Email</th>
                <th>Phone</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td colspan="4">TODO: List each Address</td>
            </tr>
            <tr>
                <td><a href="address.jsp">Mustermann, Max</a></td>
                <td>max.mustermann@example.com</td>
                <td>02351/23725</td>
                <td>
                    <a href="#" class="btn btn-primary btn-xs glyphicon glyphicon-pencil"></a>
                    <a href="#" class="btn btn-danger btn-xs glyphicon glyphicon-trash"></a>
                </td>
            </tr>
        </tbody>
    </table>
</t:layout>