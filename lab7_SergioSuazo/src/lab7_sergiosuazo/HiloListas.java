/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_sergiosuazo;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author Sergio
 */
public class HiloListas extends Thread{
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    private JList Lista;
    private JDialog resp;
    private ArrayList<Object> arreglo=new ArrayList<>();

    public HiloListas() {
    }

    public HiloListas(JProgressBar barra, JList Lista, JDialog resp) {
        this.barra = barra;
        this.Lista = Lista;
        this.resp = resp;
        this.avanzar=true;
        this.vive=true;
    }

    public ArrayList<Object> getArreglo() {
        return arreglo;
    }

    public void setArreglo(ArrayList<Object> arreglo) {
        this.arreglo = arreglo;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public JList getLista() {
        return Lista;
    }

    public void setLista(JList Lista) {
        this.Lista = Lista;
    }

    public JDialog getResp() {
        return resp;
    }

    public void setResp(JDialog resp) {
        this.resp = resp;
    }
    


    @Override
    public void run() {
        while(vive)
        {
            if(avanzar)
            {
                barra.setValue(barra.getValue()+1);
                if(barra.getValue()==3)
                {
                    vive=false;
                    barra.setValue(0);
                    DefaultListModel m=(DefaultListModel)Lista.getModel();
                    for (int i = 0; i < arreglo.size(); i++) {
                        m.addElement(arreglo.get(i));
                    }
                    Lista.setModel(m);
                    JOptionPane.showMessageDialog(resp, "Se cargo exitosamente");
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
