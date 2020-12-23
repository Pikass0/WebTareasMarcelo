/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarea.servlets;

import com.tarea.model.Tarea;
import com.tarea.services.DB;
import com.tarea.services.LoginService;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.login.LoginException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author user
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //leer parametros
        String username = req.getParameter("user");
        String password = req.getParameter("password");
        //validar
        //se valida en LoginService y al crear user en la clase
        //si todo ok
        HttpSession sesion = req.getSession();
        
        LoginService servicio = new LoginService();

        
        String jspAMostrar = "";
        
        try {
            servicio.login(username, password, sesion);
            //meter todas sus tareas en atributo para tenerlas listas
            //no necesita comprobaciones porque pasaría al catch
            Collection<Tarea> tareas = DB.getTareasUsuario(username);
            //No se si es mejor separar aqui en tres, por ahora asi
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
            sesion.setAttribute("todo", cTodo);
            sesion.setAttribute("progress", cProgress);
            sesion.setAttribute("done", cDone);
            jspAMostrar = "index.jsp";
        } catch (LoginException ex) {
            req.setAttribute("mensaje", ex.getMessage());
            jspAMostrar = "login.jsp";
        }
        
        //despachar

        RequestDispatcher rd = req.getRequestDispatcher(jspAMostrar);
        rd.forward(req, resp);
        
        
    }

}
