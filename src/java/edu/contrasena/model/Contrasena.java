/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.contrasena.model;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Contrasena {
    
    private String idUsuario = "";
    private String contrasena = "";
    private String nuevaContrasena = "";
    private String notificacion = "";
    private ArrayList<String> listaContrasena = new ArrayList();

    public Contrasena() {
    }

    public Contrasena(String idUsuario, String contrasena, String nuevaContrasena) {
        this.idUsuario = idUsuario;
        this.contrasena = contrasena;
        this.nuevaContrasena = nuevaContrasena;
    }

    public String newUser() {
        if(this.idUsuario == null || this.idUsuario.equals("")) {
            return this.notificacion = "Nombre de Usuario Invalido";
        } else {
            if(this.contrasena == null || this.contrasena.equals("")) {
                return this.notificacion = "Contraseña Invalida";
            } else {
                for (int i = 0; i < listaContrasena.size(); i++) {
                    if(this.contrasena.equals(listaContrasena.get(i))) {
                        return this.notificacion = "La contraseña ya existe";
                    }
                }
                listaContrasena.add(this.contrasena);
                return this.notificacion = "Contraseña guardada exitosamente";
            }
        }
    }
    
    public String updateUser(){
        if(this.contrasena.equals(listaContrasena.get(listaContrasena.size() - 1))){
            for(int i = 0; i < listaContrasena.size(); i++) {
                if(!this.nuevaContrasena.equals(listaContrasena.get(i))) {
                    listaContrasena.set(listaContrasena.size() - 1, this.nuevaContrasena);
                    return this.notificacion = "Contraseña Modificada";
                }
            }
            return notificacion = "Contraseña Repetida";
        } else {
            return notificacion = "Contraseña Incorrecta";
        }
    }
    
    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNuevaContrasena() {
        return nuevaContrasena;
    }

    public void setNuevaContrasena(String nuevaContrasena) {
        this.nuevaContrasena = nuevaContrasena;
    }

    public String getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(String notificacion) {
        this.notificacion = notificacion;
    }

    public ArrayList<String> getListaContrasena() {
        return listaContrasena;
    }

    public void setListaContrasena(ArrayList<String> listaContrasena) {
        this.listaContrasena = listaContrasena;
    }
    
}
