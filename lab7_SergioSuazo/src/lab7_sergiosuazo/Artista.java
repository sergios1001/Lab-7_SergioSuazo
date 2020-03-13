/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_sergiosuazo;

import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
public class Artista extends Persona{
    private String genero;
    private ArrayList<Cancion> canciones=new ArrayList<Cancion>();

    public Artista() {
    }

    public Artista(String genero, String nombre, String usuario, String contra) {
        super(nombre, usuario, contra);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "Artista{" + "genero=" + genero + ", canciones=" + canciones + '}';
    }
    
}
