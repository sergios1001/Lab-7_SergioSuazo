/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_sergiosuazo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sergio
 */
public class Evento implements Serializable{
    private String ciudad,lugar;
    private int capacidad;
    private Date fecha;
    private ArrayList<Cancion> setlist=new ArrayList<Cancion>();
    
    private static final long SerialVersionUID=777L;

    public Evento() {
    }

    public Evento(String ciudad, String lugar, int capacidad, Date fecha) {
        this.ciudad = ciudad;
        this.lugar = lugar;
        this.capacidad = capacidad;
        this.fecha = fecha;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Cancion> getSetlist() {
        return setlist;
    }

    public void setSetlist(ArrayList<Cancion> setlist) {
        this.setlist = setlist;
    }

    @Override
    public String toString() {
        return "Evento{" + "ciudad=" + ciudad + ", lugar=" + lugar + '}';
    }
    
}
