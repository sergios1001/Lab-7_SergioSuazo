/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_sergiosuazo;

/**
 *
 * @author Sergio
 */
public class Solista extends Artista{
    private int edad;

    public Solista() {
    }    

    public Solista(int edad, String genero, String nombre, String usuario, String contra) {
        super(genero, nombre, usuario, contra);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Solista{" + "edad=" + edad + '}';
    }
    
}
