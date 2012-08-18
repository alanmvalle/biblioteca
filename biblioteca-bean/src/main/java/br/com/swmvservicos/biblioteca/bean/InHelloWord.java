/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.swmvservicos.biblioteca.bean;

import java.io.Serializable;

/**
 *
 * @author mattosal
 */
public class InHelloWord implements Serializable{
    
    private String texto;

    public InHelloWord() {
        texto = "";
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
}
