package com.UNAB.APIpapeleria.models.respuestas;

public class EmpleadoDataRestModel {
    private String idEmpleado;
    private String nombre;
    private String email;
    private String username;

    public String getIdEmpleado() {
        return this.idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
   
}
