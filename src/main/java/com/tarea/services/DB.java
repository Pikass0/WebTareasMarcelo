
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
    private static int ultimoIdTarea = 3;

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
 
    }
    

    //para que nadie haga new
    private DB() {
    }

     
    
    
    
}
