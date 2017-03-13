
package com.zoudys;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BanqueWS", targetNamespace = "http://zoudys.com/", wsdlLocation = "file:/E:/orange/Workspace-eclipse-jee/api-test-client-by-skeleton/BanqueWS.wsdl")
public class BanqueWS
    extends Service
{

    private final static URL BANQUEWS_WSDL_LOCATION;
    private final static WebServiceException BANQUEWS_EXCEPTION;
    private final static QName BANQUEWS_QNAME = new QName("http://zoudys.com/", "BanqueWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/E:/orange/Workspace-eclipse-jee/api-test-client-by-skeleton/BanqueWS.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANQUEWS_WSDL_LOCATION = url;
        BANQUEWS_EXCEPTION = e;
    }

    public BanqueWS() {
        super(__getWsdlLocation(), BANQUEWS_QNAME);
    }

    public BanqueWS(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANQUEWS_QNAME, features);
    }

    public BanqueWS(URL wsdlLocation) {
        super(wsdlLocation, BANQUEWS_QNAME);
    }

    public BanqueWS(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANQUEWS_QNAME, features);
    }

    public BanqueWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BanqueWS(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Banque
     */
    @WebEndpoint(name = "BanquePort")
    public Banque getBanquePort() {
        return super.getPort(new QName("http://zoudys.com/", "BanquePort"), Banque.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Banque
     */
    @WebEndpoint(name = "BanquePort")
    public Banque getBanquePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://zoudys.com/", "BanquePort"), Banque.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANQUEWS_EXCEPTION!= null) {
            throw BANQUEWS_EXCEPTION;
        }
        return BANQUEWS_WSDL_LOCATION;
    }

}
