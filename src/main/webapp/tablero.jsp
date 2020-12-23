<%-- 
    Document   : tablero
    Created on : 22-dic-2020, 13:15:15
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="WEB-INF/fragmentos/includes.jspf" %>
        <title>Tablero</title>
    </head>
    <body>
        <%@include file="WEB-INF/fragmentos/includes-body.jspf" %>
        
        <div class="container" id="tablero">
            <div class="jumbotron">
                <div class="row">
                    <div class="col">
                        <div class="card text-white bg-dark mb-3" style="max-width: 18rem;">
                            <div class="card-header">To Do</div>
                            <div class="card-body ">
                                <ul class="list-group list-group-flush ">
                                    <li class="list-group-item list-group-item-dark">Cras justo odio</li>
                                    <li class="list-group-item list-group-item-dark">Dapibus ac facilisis in</li>
                                    <li class="list-group-item list-group-item-dark">Vestibulum at eros</li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card text-white bg-dark mb-3" style="max-width: 18rem;">
                            <div class="card-header">
                                In progress
                            </div>
                            <div class="card-body">
                                <ul class="list-group list-group-flush">
                                    <li class="list-group-item list-group-item-dark">Cras justo odio</li>
                                    <li class="list-group-item list-group-item-dark">Dapibus ac facilisis in</li>
                                    <li class="list-group-item list-group-item-dark">Vestibulum at eros</li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card text-white bg-dark mb-3" style="max-width: 18rem;">
                            <div class="card-header">
                                Done
                            </div>
                            <div class="card-body">
                                <ul class="list-group list-group-flush">
                                    <li class="list-group-item list-group-item-dark">Cras justo odio</li>
                                    <li class="list-group-item list-group-item-dark">Dapibus ac facilisis in</li>
                                    <li class="list-group-item list-group-item-dark">Vestibulum at eros</li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </body>
    <!--<script src="js/arrastrar.js" type="text/javascript"></script>-->

</html>
