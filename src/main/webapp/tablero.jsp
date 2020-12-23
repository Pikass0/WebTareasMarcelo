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
        algun dia pondré bien los botones
        <div class="container" id="tablero">
            <div class="jumbotron">
                <div class="row">
                    <!--TODO-->
                    <div class="col">
                        <div class="card text-white bg-dark mb-3" style="max-width: 18rem;">
                            <div class="card-header">To Do</div>
                            <div class="card-body ">
                                <div class="list-group list-group-flush"  id="todo" role="tablist">
                                    <a class="list-group-item list-group-item-dark list-group-item-action" data-toggle="list"  >Home</a>
                                    <a class="list-group-item list-group-item-dark list-group-item-action" data-toggle="list" >Profile</a>
                                    <a class="list-group-item list-group-item-dark list-group-item-action" data-toggle="list" >Messages</a>
                                    <a class="list-group-item list-group-item-dark list-group-item-action" data-toggle="list">Settings</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--BOTONES TODO-PROGRESS-->
                    <div class="col-auto d-flex flex-column">
                        <div class="btn-group-vertical" role="group" aria-label="Button group">
                            <button type="button" class="btn btn-secondary">></button>
                            <button type="button" class="btn btn-secondary"><</button>
                        </div>
                    </div>
                    <!--IN PROGRESS-->
                    <div class="col">
                        <div class="card text-white bg-dark mb-3" style="max-width: 18rem;">
                            <div class="card-header">
                                In progress
                            </div>
                            <div class="card-body">
                                <div class="list-group list-group-flush"  id="todo" role="tablist">
                                    <a class="list-group-item list-group-item-dark list-group-item-action" data-toggle="list"  >Home</a>
                                    <a class="list-group-item list-group-item-dark list-group-item-action" data-toggle="list" >Profile</a>
                                    <a class="list-group-item list-group-item-dark list-group-item-action" data-toggle="list" >Messages</a>
                                    <a class="list-group-item list-group-item-dark list-group-item-action" data-toggle="list">Settings</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--BOTONES IN PROGRESS-DONE-->
                    <div class="col-auto d-flex flex-column">
                        <div class="btn-group-vertical" role="group" aria-label="Button group">
                            <button type="button" class="btn btn-secondary">></button>
                            <button type="button" class="btn btn-secondary"><</button>
                        </div>
                    </div>
                    <!--DONE-->
                    <div class="col">
                        <div class="card text-white bg-dark mb-3" style="max-width: 18rem;">
                            <div class="card-header">
                                Done
                            </div>
                            <div class="card-body">
                                <div class="list-group list-group-flush"  id="todo" role="tablist">
                                    <a class="list-group-item list-group-item-dark list-group-item-action" data-toggle="list"  >Home</a>
                                    <a class="list-group-item list-group-item-dark list-group-item-action" data-toggle="list" >Profile</a>
                                    <a class="list-group-item list-group-item-dark list-group-item-action" data-toggle="list" >Messages</a>
                                    <a class="list-group-item list-group-item-dark list-group-item-action" data-toggle="list">Settings</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </body>
    <!--<script src="js/arrastrar.js" type="text/javascript"></script>-->
    <script>

    </script>
</html>
