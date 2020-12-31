<%-- 
    Document   : tablero
    Created on : 22-dic-2020, 13:15:15
    Author     : user
--%>

<%@page import="com.tarea.model.Tarea"%>
<%@page import="java.util.Collection"%>
<%@page import="com.tarea.services.DB"%>
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
        <c:if test="${sessionScope.usuario == null}">
            <div class="aler alert-danger" role="alert">
                No te has logueado (en un futuro mandarle al login y que no pueda meterse aqui)
            </div>
        </c:if>

        <div class="container" id="tablero">
            <div class="jumbotron">
                <div class="row">
                    <!--TODO-->
                    <div class="col">
                        <div class="card text-white bg-dark mb-3" style="max-width: 18rem;">
                            <div class="card-header">To Do</div>
                            <div class="card-body ">
                                <div class="list-group list-group-flush" id="todo"  role="tablist">
                                    <c:forEach var="tarea" items="${requestScope.todo}">
                                        <a class="list-group-item list-group-item-dark list-group-item-action"
                                           data-toggle="list"><div class="hidden-id">${tarea.idTarea} </div>${tarea.descripcion}</a>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--BOTONES TODO-PROGRESS-->
                    <div class="col-auto d-flex flex-column">
                        <div class="btn-group-vertical center" role="group" aria-label="Button group">
                            <input type="button" onclick="mover('todo','progress');" class="btn btn-secondary btn-der" value=">" />
                            <input type="button" onclick="mover('progress','todo');" class="btn btn-secondary btn-izq" value="<"/>
                        </div>
                    </div>
                    <!--IN PROGRESS-->
                    <div class="col">
                        <div class="card text-white bg-dark mb-3" style="max-width: 18rem;">
                            <div class="card-header">
                                In progress
                            </div>
                            <div class="card-body">
                                <div class="list-group list-group-flush" id="progress" role="tablist">
                                    <c:forEach var="tarea" items="${requestScope.progress}"> 
                                        <a class="list-group-item list-group-item-dark list-group-item-action"
                                           data-toggle="list"> <div class="hidden-id">${tarea.idTarea} </div> ${tarea.descripcion}</a>
                                    </c:forEach> 
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--BOTONES IN PROGRESS-DONE-->
                    <div class="col-auto d-flex flex-column">
                        <div class="btn-group-vertical center" role="group" aria-label="Button group">
                            <input type="button" onclick="mover('progress','done');" class="btn btn-secondary btn-der" value=">"/>
                            <input type="button" onclick="mover('done','progress');" class="btn btn-secondary btn-izq" value="<"/>
                        </div>
                    </div>
                    <!--DONE-->
                    <div class="col">
                        <div class="card text-white bg-dark mb-3" style="max-width: 18rem;">
                            <div class="card-header">
                                Done
                            </div>
                            <div class="card-body">
                                <div class="list-group list-group-flush" id="done" role="tablist"> 
                                    <c:forEach var="tarea" items="${requestScope.done}"> 
                                        <a class="list-group-item list-group-item-dark list-group-item-action"
                                           data-toggle="list"><div class="hidden-id">${tarea.idTarea} </div>${tarea.descripcion}</a>
                                    </c:forEach> 
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
        //lo dejamos para un futuro (quiero que si clica una tarea marcada, se desmarque)
        $('#tablero a').on('click', function () {
            if ($(this).hasClass('active')) {
                // $(this).remove('active')
                this.classList.remove('active');
                //no se por que no funciona eso pero bueno, llegar llega aqui
            }

        })

        function mover(tabla, tablaDestino) {
            var tareas = document.querySelectorAll('#'+tabla+' a');
            tareas.forEach(tarea => {
                if (tarea.classList.contains('active')) {
                    //si está seleccionado coge el id escondido en div
                    var id = tarea.querySelector('.hidden-id').innerHTML;
                    llamarServlet(id, tablaDestino);
                    // break; no deja break
                }
            })
        }

        function llamarServlet(id, tablaDestino) {
            id = id.trim();
            document.location.href="tablero?id="+id+"&tabla="+tablaDestino;
        }

        function llamarServletNofunciona(id, tablaDestino) {
            // var xhr = new XMLHttpRequest();
            // xhr.open("POST", '/tablero', true);
            //
            // //Send the proper header information along with the request
            // xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
            //
            // xhr.onreadystatechange = function() { // Call a function when the state changes.
            //     if (this.readyState === XMLHttpRequest.DONE && this.status === 200) {
            //         // Request finished. Do processing here.
            //     }
            // }
            // xhr.send("id="+id+"&tabla="+tablaDestino);
        }

    </script>
</html>
