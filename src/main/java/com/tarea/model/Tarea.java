
package com.tarea.model;


public class Tarea {

//    public static final String TODO = "TODO";
//    public static final String IN_PROGRESS = "IN PROGRESS";
//    public static final String DONE = "DONE";
    
    private int idTarea;
    private String descripcion;
    private Estado estado;

    
    public Tarea(int idTarea, String descripcion) {
        this.idTarea = idTarea;
        this.descripcion = descripcion;
    }

    public Tarea(int idTarea, String descripcion, Estado estado) {
        this(idTarea, descripcion);
        this.estado = estado;

    }

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.idTarea;
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
        final Tarea other = (Tarea) obj;
        if (this.idTarea != other.idTarea) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tarea{" + "idTarea=" + idTarea + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    }
    
    
    
    
    
}
