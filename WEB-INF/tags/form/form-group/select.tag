<%@tag description="Select field with label" pageEncoding="UTF-8"%>
<%@attribute name="property" required="true"%>
<%@attribute name="text" required="true"%>
<div class="form-group">
    <label for="${property}Input" class="col-sm-2 control-label">${text}</label>
    <div class="col-sm-4">
        <select id="${property}Input" name="${property}" class="form-control">
            <jsp:doBody/>
        </select>
    </div>
</div>
