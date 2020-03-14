/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_sergiosuazo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
public class adminAccion {
    private ArrayList<Accion> listaAccion=new ArrayList<>();
    private File archivo=null;

    public adminAccion(String path) {
        archivo=new File(path);
    }

    public ArrayList<Accion> getListaAccion() {
        return listaAccion;
    }

    public void setListaAccion(ArrayList<Accion> listaAccion) {
        this.listaAccion = listaAccion;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void setAccion(Accion a)
    {
        this.listaAccion.add(a);
    }
    
    public void cargarArchivo() {
        try {            
            listaAccion= new ArrayList();
            Accion temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Accion) objeto.readObject()) != null) {
                        listaAccion.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Accion t : listaAccion) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
