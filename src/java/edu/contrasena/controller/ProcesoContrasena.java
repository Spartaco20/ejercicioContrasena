/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.contrasena.controller;

import edu.contrasena.model.Contrasena;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author HP
 */
@ManagedBean
@SessionScoped
public class ProcesoContrasena implements Serializable{

    private Contrasena contrasena = new Contrasena ();
    
    public ProcesoContrasena() {
    }
    
    public void nuevoUsuario(){
        contrasena.newUser();
    }

    public void modificarUsuario(){
        contrasena.updateUser();
    }
    
    public Contrasena getContrasena() {
        return contrasena;
    }

    public void setContrasena(Contrasena contrasena) {
        this.contrasena = contrasena;
    }
    
}
