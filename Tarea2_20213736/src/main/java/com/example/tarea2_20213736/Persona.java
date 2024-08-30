package com.example.tarea2_20213736;

public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private String codigo;
    private String direccion;

    public Persona (String nombre, String apellido, String dni, String codigo, String direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.codigo = codigo;
        this.direccion = direccion;
    }

    public Persona(){
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
