
package com.wuwenlun.ws.simple.card;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "IDCardImplService", targetNamespace = "http://card.simple.ws.wuwenlun.com/", wsdlLocation = "http://127.0.0.1:12345/idcard?wsdl")
public class IDCardImplService
    extends Service
{

    private final static URL IDCARDIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException IDCARDIMPLSERVICE_EXCEPTION;
    private final static QName IDCARDIMPLSERVICE_QNAME = new QName("http://card.simple.ws.wuwenlun.com/", "IDCardImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:12345/idcard?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        IDCARDIMPLSERVICE_WSDL_LOCATION = url;
        IDCARDIMPLSERVICE_EXCEPTION = e;
    }

    public IDCardImplService() {
        super(__getWsdlLocation(), IDCARDIMPLSERVICE_QNAME);
    }

    public IDCardImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), IDCARDIMPLSERVICE_QNAME, features);
    }

    public IDCardImplService(URL wsdlLocation) {
        super(wsdlLocation, IDCARDIMPLSERVICE_QNAME);
    }

    public IDCardImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, IDCARDIMPLSERVICE_QNAME, features);
    }

    public IDCardImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IDCardImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IDCardImpl
     */
    @WebEndpoint(name = "IDCardImplPort")
    public IDCardImpl getIDCardImplPort() {
        return super.getPort(new QName("http://card.simple.ws.wuwenlun.com/", "IDCardImplPort"), IDCardImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IDCardImpl
     */
    @WebEndpoint(name = "IDCardImplPort")
    public IDCardImpl getIDCardImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://card.simple.ws.wuwenlun.com/", "IDCardImplPort"), IDCardImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (IDCARDIMPLSERVICE_EXCEPTION!= null) {
            throw IDCARDIMPLSERVICE_EXCEPTION;
        }
        return IDCARDIMPLSERVICE_WSDL_LOCATION;
    }

}
