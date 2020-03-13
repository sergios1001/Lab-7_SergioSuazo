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
public class Usuario extends Persona{
    private int edad;
    private ArrayList<Evento> eventos=new ArrayList<>();
    private ArrayList<Artista> artistas=new ArrayList<>();

    public Usuario() {
    }

    public Usuario(int edad, String nombre, String usuario, String contra) {
        super(nombre, usuario, contra);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }

    @Override
    public String toString() {
        return "Usuario{" + "edad=" + edad + ", eventos=" + eventos + ", artistas=" + artistas + '}';
    }
    
}
