/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarea.servlets;

import com.tarea.model.Tarea;
import com.tarea.model.Usuario;
import com.tarea.services.DB;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet(name = "TableroServlet", urlPatterns = {"/tablero"})
public class TableroServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //por el get pasa cuando carga la pagina
        Usuario usuario = (Usuario) req.getSession().getAttribute("usuario");
        String jspAMostrar = "";
        if (usuario==null) {
            req.setAttribute("mensaje", "Necesita loguearse");
            jspAMostrar = "login.jsp";
        }
        else if(req.getParameter("idTarea") != null){
            //Si esta moviendo una tarea
            Tarea tarea = DB.getTarea(Integer.parseInt(req.getParameter("idTarea")), usuario.getUsername());
            switch (req.getParameter("tabla")) {
                case "todo":
                    
                    break;
                case "progress":
                    
                    break;
                case "done":
                    
                    break;

            }
            
            
        }else{
            //si esta recargando la pagina entera
            //meter todas sus tareas en atributo
            Collection<Tarea> tareas = DB.getTareasUsuario(usuario.getUsername());
            //No se si es mejor separar aqui en tres, por ahora sí
            Set<Tarea> cTodo= new HashSet<>();
            Set<Tarea> cProgress=new HashSet<>();
            Set<Tarea> cDone=new HashSet<>();

            if (tareas != null) {
                for (Tarea tarea : tareas) {
                    switch(tarea.getEstado()){
                        case TODO:
                            cTodo.add(tarea);
                            break;
                        case IN_PROGRESS:
                            cProgress.add(tarea);
                            break;
                        case DONE:
                            cDone.add(tarea);
                    }
                }
            }
            req.setAttribute("todo", cTodo);
            req.setAttribute("progress", cProgress);
            req.setAttribute("done", cDone);
        
            jspAMostrar = "tablero.jsp";
        }

        //despachar

        RequestDispatcher rd = req.getRequestDispatcher(jspAMostrar);
        rd.forward(req, resp);    
            
    }

    

}
