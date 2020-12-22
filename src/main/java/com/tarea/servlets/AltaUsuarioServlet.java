/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarea.servlets;

import com.tarea.exceptions.DBException;
import com.tarea.exceptions.UsuarioException;
import com.tarea.model.Usuario;
import com.tarea.services.DB;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "AltaUsuarioServlet", urlPatterns = {"/alta-usuario"})
public class AltaUsuarioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("user");
        String password = request.getParameter("password");
        
        Usuario user = null;

        try {
            user = new Usuario(username, password);
            DB.crearUsuario(user);

            //add usuario atributo ed sesion
            //el usuario no manda jsessionid, crea una nueva sesion
            //si no devuelve la sesion existete para el id

        } catch (DBException | UsuarioException ex) {
            request.setAttribute("mensaje", ex.getMessage());
        } 
        
        
        
        // DESPACHAR LA RESPUESTA 
        //4. SI HAY ALGUN ERROR ir a form-alta-usuario.jsp
        //   SINO ir a lista-usuarios.jsp
        String jspAMostrar = "login.jsp";
        if (user != null) {
            jspAMostrar = "index.jsp";
        }
        
        RequestDispatcher rd = request.getRequestDispatcher(jspAMostrar);
        rd.forward(request, response);
        
    }


}
