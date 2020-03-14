/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_sergiosuazo;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author Sergio
 */
public class HiloCargar extends Thread{
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    private int duracion;
    private JDialog resp;

    public HiloCargar() {
    }

    public HiloCargar(JProgressBar barra,int duracion,JDialog resp) {
        this.barra = barra;
        this.avanzar = true;
        this.vive = true;
        this.duracion = duracion;
        this.resp=resp;
    }

    public JDialog getResp() {
        return resp;
    }

    public void setResp(JDialog resp) {
        this.resp = resp;
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public void run() {
        while(vive)
        {
            if(avanzar)
            {
                barra.setValue(barra.getValue()+1);
                if(barra.getValue()==duracion)
                {
                    vive=false;
                    barra.setValue(0);
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
