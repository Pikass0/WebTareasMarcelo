package com.tarea.servlets;

import com.tarea.model.Usuario;
import com.tarea.services.DB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EliminarTareaServlet", urlPatterns = {"/eliminar-tarea"})
public class EliminarTareaServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String sid = req.getParameter("id");
        Usuario user = (Usuario) req.getSession().getAttribute("usuario");
        try {
            int id = Integer.parseInt(sid);
            if (user != null && id > 0) {
                DB.eliminarTarea(user.getUsername(), id);
                //mensaje successful (puede que los meta en "mensaje" y ya, no se)
                req.setAttribute("mensajeS", "Tarea eliminar");
            }else{
                //mensaje error
                req.setAttribute("mensajeE", "No se pudo eliminar la tarea.");
            }
        }catch(NumberFormatException e){
            req.setAttribute("mensajeE", "No se pudo eliminar la tarea.");
        }


        //redireccionar
        resp.sendRedirect("tablero");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
