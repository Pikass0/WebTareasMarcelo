
package com.tarea.services;

import com.tarea.model.Usuario;
import javax.security.auth.login.LoginException;
import javax.servlet.http.HttpSession;

public class LoginService {
   
    public void login(String username, String password, HttpSession sesion) throws LoginException{

        Usuario usuario = DB.userExists(username);

        if (usuario == null) {
            throw new LoginException("El usuario no existe. Debe registrarse.");
        }else{
            if (usuario.getPassword().equals(password)) {
                sesion.setAttribute("usuario", usuario);
            }else{
                throw new LoginException("Clave no válida");
            }
        }
    }
    
    public void logout(HttpSession sesion){
        sesion.invalidate();
    }
    
}
