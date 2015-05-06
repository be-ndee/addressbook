<%@tag description="Hidden input field" pageEncoding="UTF-8"%>
<%@attribute name="property" required="true"%>
<%@attribute name="value" required="true"%>
<input id="${property}Input" type="hidden" name="${property}" value="${value}" />
