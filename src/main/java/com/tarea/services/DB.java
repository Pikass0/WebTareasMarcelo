
package com.tarea.services;

import com.tarea.model.Tarea;
import com.tarea.model.Usuario;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class DB {
    private static Map<String, Set<Integer>> tareasUsuario;  //username, id tareas
    private static Map<Integer, Tarea> tareas; //id tarea como key, tarea
    private static Set<Usuario> usuarios;
    private static int ultimoIdTarea = 4;

    static{
        //inicializacion de Tareas
        tareas = new HashMap<>();
        tareas.put(1, new Tarea(1, "Comprar pan"));
        
        
    }
    
    
    //para que nadie haga new
    private DB() {
    }

     
    
    
    
}
