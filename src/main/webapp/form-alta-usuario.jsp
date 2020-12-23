<%-- 
    Document   : form-alta-usuario
    Created on : 22-dic-2020, 13:17:35
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="WEB-INF/fragmentos/includes.jspf" %>
    </head>
    <body>
        <%@include file="WEB-INF/fragmentos/includes-body.jspf" %>
        <div class="container">

            <h1>Alta Nuevo Usuario</h1>

            <!-- mensaje error alta -->
            <c:if test="${not empty requestScope.msgErrorAlta }" >
                <div class="alert alert-danger" role="alert">
                    ${requestScope.msgErrorAlta}
                </div>
            </c:if>

            <!--  formulario  -->

            <form action="alta-usuario" method="post">
                <div class="form-group">
                    <input type="text" class="form-control" id="user" 
                           placeholder="Introduce el usuario" name="user" required>
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" id="password" 
                           placeholder="Introduce la clave" name="password" required>
                </div>
                
                <button type="submit" class="btn btn-secondary">Registrar</button>
            </form> 

        </div>
    </body>
</html>
