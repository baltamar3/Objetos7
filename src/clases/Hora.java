/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author baltamar
 */
public class Hora {

    private int hora;
    private int minutos;
    private int segundos;

    public Hora() {

        this.hora = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public Hora(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public String validarHora1() {
        int h, m, s;
        h = this.hora;
        m = this.minutos;
        s = this.segundos;

        String aux;
        if (h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60) {
            aux = "Hora 1 valida";
        } else {
            aux = "Hora 1 NO valida";
        }
        return aux;
    }
    
    public String validarHora2() {
        int h, m, s;
        h = this.hora;
        m = this.minutos;
        s = this.segundos;

        String aux;
        if (h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60) {
            aux = "Hora 2 valida";
        } else {
            aux = "Hora 2 NO valida";
        }
        return aux;
    }

    public String compararHoras(Hora hora1){
        int h1,h2,m1,m2,s1,s2;
        String aux;
        Hora hora2;
        
        h1=this.hora;
        m1=this.minutos;
        s1=this.segundos;
        h2=hora1.getHora();
        m2=hora1.getMinutos();
        s2=hora1.getSegundos();
        
        if(h1>h2){
            aux="La HORA 1 es mayor que la HORA 2";
        }else if(h1==h2 && m1>m2){
            aux="La HORA 1 es mayor que la HORA 2";
        }else if(h1==h2 && m1==m2 && s1>s2){
            aux="La HORA 1 es mayor que la HORA 2";
        }else if(h1==h2 && m1==m2 && s1==s2){
            aux="Las dos horas son iguales";
        }else{
            aux="La HORA 2 es mayor que la HORA 1";
        }
        return aux;
        
    }
}
