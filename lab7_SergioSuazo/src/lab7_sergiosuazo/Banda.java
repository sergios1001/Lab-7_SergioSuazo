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
public class Banda extends Artista{
    private int integrantes;

    public Banda() {
    }

    public Banda(int integrantes, String genero, String nombre, String usuario, String contra) {
        super(genero, nombre, usuario, contra);
        this.integrantes = integrantes;
    }

    public int getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
    }

    @Override
    public String toString() {
        return "Banda{" + "integrantes=" + integrantes + '}';
    }
    
}
