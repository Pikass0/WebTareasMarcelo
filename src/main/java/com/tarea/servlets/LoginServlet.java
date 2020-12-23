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
