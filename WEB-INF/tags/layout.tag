<%@tag description="Layout template for all pages" pageEncoding="UTF-8"%>
<%@attribute name="pageTitle" required="true"%>
<html>
    <head>
        <title>${pageTitle}</title>
        <link href="../assets/components/bootstrap/dist/css/bootstrap.min.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="list.jsp">Addressbook</a>
                </div>

                <div class="collapse navbar-collapse" id="navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="list.jsp">List</a></li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>

        <div class="container">
            <jsp:doBody/>
        </div>
        <script src="../assets/components/jquery/dist/jquery.min.js" type="text/javascript"></script>
        <script src="../assets/components/bootstrap/dist/js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>