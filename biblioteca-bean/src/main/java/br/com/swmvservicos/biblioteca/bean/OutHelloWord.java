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
public class OutHelloWord implements Serializable{
    
    private String mensagem;

    public OutHelloWord() {
        mensagem = "";
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
