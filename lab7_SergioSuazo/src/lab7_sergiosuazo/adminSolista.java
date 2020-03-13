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
public class adminSolista {
    private ArrayList<Solista> listaSolista=new ArrayList<>();
    private File archivo=null;

    public adminSolista(String path) {
        archivo=new File(path);
    }

    public ArrayList<Solista> getListaSolista() {
        return listaSolista;
    }

    public void setListaSolista(ArrayList<Solista> listaSolista) {
        this.listaSolista = listaSolista;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void setSolista(Solista s)
    {
        this.listaSolista.add(s);
    }
    
    public void cargarArchivo() {
        try {            
            listaSolista = new ArrayList();
            Solista temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Solista) objeto.readObject()) != null) {
                        listaSolista.add(temp);
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
            for (Solista t : listaSolista) {
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
