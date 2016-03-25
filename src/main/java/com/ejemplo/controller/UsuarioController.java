package com.ejemplo.controller;

import com.ejemplo.model.Usuario;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 * Created by Geovanny Mendoza on 25/03/2016.
 */
@ManagedBean
@ViewScoped
public class UsuarioController {

    private Usuario registrarUsuario;

    public UsuarioController() {
        this.registrarUsuario = new Usuario();
    }

    public Usuario getRegistrarUsuario() {
        return registrarUsuario;
    }

    public void setRegistrarUsuario(Usuario registrarUsuario) {
        this.registrarUsuario = registrarUsuario;
    }

    public String Registrar()
    {
        System.out.println("Registrar usuario : " + this.registrarUsuario);
        String msg = "Usuario registrado Sastifactoriamente";

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,msg,msg));
        FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
        return "registro.jsf?faces-redirect=true";
    }

}
