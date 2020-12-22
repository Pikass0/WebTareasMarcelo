
package com.tarea.model;

import com.tarea.exceptions.UsuarioException;
import java.util.Objects;


public class Usuario {
    

    private String password;
    private String username;


    public Usuario( String username, String password ) throws UsuarioException {
        //obligar a que el nombre tenga al menos 5 caracteres y password 8
        if (username == null || username.trim().length() < 5 || password == null || password.length() < 8) {
            //no sé si esta bien poner una exception en un constructor
            throw new UsuarioException("Error al crear usuario. Compruebe el username y contraseña.");
        }
        this.password = password;
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.username);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "password=" + password + ", username=" + username + '}';
    }
    
    
    
    
    
    
    
    
}
