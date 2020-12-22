
package com.tarea.services;

import com.tarea.exceptions.UsuarioException;
import com.tarea.model.Tarea;
import com.tarea.model.Usuario;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class DB {
    private static Map<String, Set<Tarea>> tareas;  //username, tareas
    private static Set<Usuario> usuarios;
    private static int ultimoIdTarea = 0;
    static{
        //inicializacion de Usuarios
        usuarios = new HashSet<>();
        try {
            usuarios.add(new Usuario("test", "12345678"));
            usuarios.add(new Usuario("test2", "12345678"));
            usuarios.add(new Usuario("test3", "12345678"));
        } catch (UsuarioException ex) {
            System.out.println("Error al inicializar: "+ ex.getMessage());
        }
        //inicializacion de Tareas
        tareas = new HashMap<>();
        
 
    }
    

    //para que nadie haga new
    private DB() {
        //inicializar tareas (los 3 usuarios test van a tener las mismas tareas, pero con distinto id (solo es igual la desc))
        for (Usuario user : usuarios) {
            //inicializamos el set tareas
            tareas.put(user.getUsername(), new HashSet<Tarea>());
            //metemos tareas en el set
            tareas.get(user.getUsername()).add(new Tarea(++ultimoIdTarea, "Comprar pan"));
            tareas.get(user.getUsername()).add(new Tarea(++ultimoIdTarea, "Comprar leche"));
            tareas.get(user.getUsername()).add(new Tarea(++ultimoIdTarea, "Comprar 4 naranjas"));
        }
    }

    public static Map<String, Set<Tarea>> getTareas() {
        return tareas;
    }

    public static void setTareas(Map<String, Set<Tarea>> tareas) {
        DB.tareas = tareas;
    }

    public static Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(Set<Usuario> usuarios) {
        DB.usuarios = usuarios;
    }


     
    
    
    
    
    
    
}
