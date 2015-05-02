<%@tag description="Layout template for all pages" pageEncoding="UTF-8"%>
<%@attribute name="pageTitle" required="true"%>
<html>
  <head>
    <title>${pageTitle}</title>
  </head>
  <body>
    <h1>Addressbook</h1>
    <div class="content">
      <jsp:doBody/>
    </div>
  </body>
</html>