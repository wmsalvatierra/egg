/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Ahorcado {
     private String [] palabra;
    private int leten;
    private int jugadasmax;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int leten, int jugadasmax) {
        this.palabra = palabra;
        this.leten = leten;
        this.jugadasmax = jugadasmax;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra, int n) {
        this.palabra=new String[n];
        this.palabra = palabra;
    }

    public int getLeten() {
        return leten;
    }

    public void setLeten(int leten) {
        this.leten = leten;
    }

    public int getJugadasmax() {
        return jugadasmax;
    }

    public void setJugadasmax(int jugadasmax) {
        this.jugadasmax = jugadasmax;
    }
    
    
}
