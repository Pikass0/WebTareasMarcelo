
package com.tarea.services;

import com.tarea.exceptions.DBException;
import com.tarea.exceptions.UsuarioException;
import com.tarea.model.Tarea;
import com.tarea.model.Usuario;
import java.util.Collection;
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
        //inicializacion de Tareas (cada usuario tiene lista de tareas)
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

    
    //----------TAREAS---------
    
    public synchronized static Collection<Set<Tarea>> getAllTareas() {
        //comprobar si funciona esto
        return tareas.values();
    }
    
    /**
     * Buscar una tarea por ID y nombre de usuario
     * @param idTarea id de la tarea
     * @param username nombre del usuario
     * @return returns Tarea if exists, null otherwise
     */
    public synchronized static Tarea getTarea(int idTarea, String username){
        Tarea tarea = null;
        return tarea;
    }
    
    /**
     * Crea tarea teniendo en cuenta el usuario
     * @param username usuario
     * @param descripcion descripcion de la tarea
     */
    public synchronized static void crearTarea(String username, String descripcion){
        tareas.get(username).add(new Tarea(++ultimoIdTarea, descripcion));
    }

    //----------USUARIOS---------
    

    public synchronized static Collection<Usuario> getAllUsuarios() {
        return usuarios;
    }

    public synchronized static void crearUsuario(Usuario user) throws DBException{
        boolean isAdded = usuarios.add(user);
        if (!isAdded) {
            throw new DBException("El usuario no pudo ser añadido. El username ya existe");
        }else{
            //se inicializa su lista de tareas
            tareas.put(user.getUsername(), new HashSet<Tarea>());
        }
    }
     
    /**
     * Comprueba si existe un usuario
     * @param username username to search
     * @return returns user if it finds one, null otherwise
     */
    public synchronized static Usuario userExists(String username){
        //Creo que esto no me hará falta por el Set, pero por si acaso
        for (Usuario usuario : usuarios) {
            if ( usuario.getUsername().equals(username)) {
                return usuario;
            }
        }
        return null;
    }
    
    
    
    
    
    
}
