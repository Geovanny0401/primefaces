package com.primefaces.model;

/**
 * Created by Geovanny Mendoza on 24/04/2016.
 */
public class Usuario {
    private Integer id;
    private String usuario;
    private String clave;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public Usuario()
    {

    }

    public Usuario(Integer id, String usuario, String clave, String nombre)
    {
        this.id=id;
        this.usuario=usuario;
        this.clave=clave;
        this.nombre=nombre;
    }
    public Usuario(Integer id, String usuario, String clave, String nombre, String apellido, String email, String telefono)
    {
        this.id=id;
        this.usuario=usuario;
        this.clave=clave;
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.telefono=telefono;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Integer getId() {
        return id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
