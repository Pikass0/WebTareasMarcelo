
package com.tarea.model;


public enum Estado {

    TODO("todo"), IN_PROGRESSS("progress"), DONE("done");
    
    private String valor;
    
    private Estado(String valor){
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
      
}
