<%-- 
    Document   : login
    Created on : 22-dic-2020, 12:53:13
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <%@include file="WEB-INF/fragmentos/includes.jspf" %>
    </head>
    <body>
        <%@include file="WEB-INF/fragmentos/includes-body.jspf" %>
        <h1>Login</h1>
        <div class="container">
            <div class="row">
                <div class="col">
                    <h1>Introduce los datos de Acceso</h1>
                </div>
            </div>
            <c:if test="${not empty requestScope.mensaje }" >
                <div class="alert alert-danger" role="alert">
                    ${requestScope.mensaje}
                </div>
            </c:if>
            <form action="login" method="post">
                <div class="form-group">
                    <label for="user">Usuario</label>
                    <input type="text" class="form-control" name="user"
                           id="user" placeholder="Introduce usuario...">
                </div>
                <div class="form-group">
                    <label for="password">Contraseña</label>
                    <input type="password" class="form-control" name="password"
                           id="password" placeholder="Contraseña...">
                </div>
                <div class="btn-group" role="group">
                    <a href="form-alta-usuario.jsp" class="btn btn-primary">Registrar</a>   
                    <button type="submit" class="btn btn-success">Login</button>
                </div>
            </form>

        </div>
    </body>
</html>
