package com.primefaces.controller;


import com.primefaces.model.Usuario;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.apache.log4j.Logger;
/**
 * Created by Geovanny Mendoza on 24/04/2016.
 */
@ManagedBean
@ViewScoped
public class UsuarioController {

    private static final Logger logger = Logger.getLogger(UsuarioController.class);

        private Usuario registrarUsuario= new Usuario();
        private Usuario loginUsuario=new Usuario();

    public String getLoginEstado() {
        return loginEstado;
    }

    public void setLoginEstado(String loginEstado) {
        this.loginEstado = loginEstado;
    }

    private String loginEstado;


        public UsuarioController() {

        }



        public Usuario getLoginUsuario() {
            return loginUsuario;
        }

        public void setLoginUsuario(Usuario loginUsuario) {
            this.loginUsuario = loginUsuario;
        }

        public String updateUser()
        {
            System.out.println("Actualizacion de Usuario: "+this.loginUsuario.getId());
            String msg="Usuario Actualizado Exitosamente";
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,msg,msg));
            return "UsuarioDetalles.jsf";
        }

        public String deleteUser()
        {
            System.out.println("Eliminacion de Usuario: "+this.loginUsuario.getId());
            String msg="Usuario Eliminado Exitosamente";
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,msg,msg));
            return "UsuarioDetalles.jsf";
        }

    public void checkUsuarioNombreExists()
    {
        String usuario=this.registrarUsuario.getUsuario();
        if("admin".equals(usuario) || "test".equals(usuario))
        {
            String msg ="Usuario ["+usuario+"] Ya Existe el Usuario";
            FacesContext.getCurrentInstance().addMessage("registroForm:usuario",new FacesMessage(FacesMessage.SEVERITY_ERROR,msg,msg));
        }
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
            return "Registro.jsf?faces-redirect=true";
        }

        public String Login()
        {
            Boolean validCredencial = "admin".equals(loginUsuario.getUsuario()) && "admin".equals(loginUsuario.getClave());
            this.loginEstado=validCredencial? "Usuario Ingresado": "Usuario Fallado";
            return null;
        }

    }
