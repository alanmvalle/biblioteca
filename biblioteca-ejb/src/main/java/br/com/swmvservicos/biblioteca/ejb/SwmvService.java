/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.swmvservicos.biblioteca.ejb;
import br.com.swmvservicos.biblioteca.bean.InHelloWord;
import br.com.swmvservicos.biblioteca.bean.OutHelloWord;
import br.com.swmvservicos.biblioteca.iface.SwmvServiceLocal;
import javax.ejb.Stateless;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.management.ServiceNotFoundException;

/**
 *
 * @author mattosal
 */
@Stateless
@WebService(serviceName = "SwmvService")
public class SwmvService implements SwmvServiceLocal{
    
    @Override
    public     
    @WebResult(name = "outHelloWord")
    OutHelloWord dizerOi(InHelloWord inHelloWord) throws ServiceNotFoundException{
        OutHelloWord outHelloWord = new OutHelloWord();
        return outHelloWord;
    }
}
