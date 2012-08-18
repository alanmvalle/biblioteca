/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.swmvservicos.biblioteca.iface;

import br.com.swmvservicos.biblioteca.bean.InHelloWord;
import br.com.swmvservicos.biblioteca.bean.OutHelloWord;
import javax.management.ServiceNotFoundException;

/**
 *
 * @author mattosal
 */
public interface SwmvServiceLocal {
    
    public OutHelloWord dizerOi(InHelloWord inHelloWord ) throws ServiceNotFoundException;
}
