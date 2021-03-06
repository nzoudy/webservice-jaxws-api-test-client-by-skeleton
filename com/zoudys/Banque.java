
package com.zoudys;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Banque", targetNamespace = "http://zoudys.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Banque {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "test", targetNamespace = "http://zoudys.com/", className = "com.zoudys.Test")
    @ResponseWrapper(localName = "testResponse", targetNamespace = "http://zoudys.com/", className = "com.zoudys.TestResponse")
    @Action(input = "http://zoudys.com/Banque/testRequest", output = "http://zoudys.com/Banque/testResponse")
    public String test();

    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conversionEuroFcfa", targetNamespace = "http://zoudys.com/", className = "com.zoudys.ConversionEuroFcfa")
    @ResponseWrapper(localName = "conversionEuroFcfaResponse", targetNamespace = "http://zoudys.com/", className = "com.zoudys.ConversionEuroFcfaResponse")
    @Action(input = "http://zoudys.com/Banque/conversionEuroFcfaRequest", output = "http://zoudys.com/Banque/conversionEuroFcfaResponse")
    public double conversionEuroFcfa(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

}
