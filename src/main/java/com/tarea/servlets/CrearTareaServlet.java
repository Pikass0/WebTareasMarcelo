/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarea.servlets;


import com.tarea.model.Usuario;
import com.tarea.services.DB;
import java.io.IOException;
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
@WebServlet(name = "CrearTareaServlet", urlPatterns = {"/crear-tarea"})
public class CrearTareaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String desc = req.getParameter("desc");
        Usuario user = (Usuario) req.getSession().getAttribute("usuario");

        if (user != null && desc.trim().length() > 0) {
            DB.crearTarea(user.getUsername(), desc);
            //mensaje successful (puede que los meta en "mensaje" y ya, no se)
            req.setAttribute("mensajeS", "Tarea creada"); 
        }else{
            //mensaje error
            req.setAttribute("mensajeE", "No se pudo crear la tarea.");
        }

        //redireccionar
        resp.sendRedirect("tablero");


        
    }
    

}
