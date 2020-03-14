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
public class Accion implements Serializable{
    Persona persona;
    String accion;
    int tiempo;

    private static final long SerialVersionUID=777L;
    
    public Accion() {
    }

    public Accion(Persona persona, String accion, int tiempo) {
        this.persona = persona;
        this.accion = accion;
        this.tiempo = tiempo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Accion{" + "persona=" + persona + ", accion=" + accion + ", tiempo=" + tiempo + '}';
    }
    
}
