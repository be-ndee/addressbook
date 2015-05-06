<%@tag description="Number input field with label" pageEncoding="UTF-8"%>
<%@attribute name="property" required="true"%>
<%@attribute name="text" required="true"%>
<%@attribute name="value" required="true"%>
<div class="form-group">
    <label for="${property}Input" class="col-sm-2 control-label">${text}</label>
    <div class="col-sm-4">
        <input id="${property}Input" type="number" name="${property}" class="form-control" value="${value}" placeholder="${text}" />
    </div>
</div>