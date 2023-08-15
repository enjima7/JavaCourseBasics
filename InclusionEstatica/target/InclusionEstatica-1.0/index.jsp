<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inclusion Estatica</title>
    </head>
    <body>
        <h1>Inclusion Estatica</h1>
        <br/>
        <ul>
            <li><%@include file="pagina/noticias1.html" %></li>
            <li><%@include file="pagina/noticias2.jsp" %></li>
        </ul>
    </body>
</html>
