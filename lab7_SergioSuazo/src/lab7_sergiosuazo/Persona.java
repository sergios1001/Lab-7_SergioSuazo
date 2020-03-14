/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_sergiosuazo;

import java.io.Serializable;

/**
 *
 * @author Sergio
 */
public class Persona implements Serializable{
    private String nombre,usuario,contra;
    
    private static final long SerialVersionUID=777L;

    public Persona() {
    }

    public Persona(String nombre, String usuario, String contra) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
