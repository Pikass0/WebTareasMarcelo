
package com.tarea.services;

import com.tarea.model.Tarea;
import com.tarea.model.Usuario;
import java.util.Map;
import java.util.Set;


public class DB {
    private static Map<String, Set<Integer>> tareasUsuario;  //username, id tareas
    private static Map<Integer, Tarea> tareas;
    private static Set<Usuario> usuarios;
    private static int ultimoIdTarea = 0;

    
}
