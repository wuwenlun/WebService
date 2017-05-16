
package com.wuwenlun.ws.simple.card;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.wuwenlun.ws.simple.card package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetInfoByIdResponse_QNAME = new QName("http://card.simple.ws.wuwenlun.com/", "getInfoByIdResponse");
    private final static QName _GetInfoById_QNAME = new QName("http://card.simple.ws.wuwenlun.com/", "getInfoById");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wuwenlun.ws.simple.card
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetInfoByIdResponse }
     * 
     */
    public GetInfoByIdResponse createGetInfoByIdResponse() {
        return new GetInfoByIdResponse();
    }

    /**
     * Create an instance of {@link GetInfoById }
     * 
     */
    public GetInfoById createGetInfoById() {
        return new GetInfoById();
    }

    /**
     * Create an instance of {@link IdCard }
     * 
     */
    public IdCard createIdCard() {
        return new IdCard();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://card.simple.ws.wuwenlun.com/", name = "getInfoByIdResponse")
    public JAXBElement<GetInfoByIdResponse> createGetInfoByIdResponse(GetInfoByIdResponse value) {
        return new JAXBElement<GetInfoByIdResponse>(_GetInfoByIdResponse_QNAME, GetInfoByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://card.simple.ws.wuwenlun.com/", name = "getInfoById")
    public JAXBElement<GetInfoById> createGetInfoById(GetInfoById value) {
        return new JAXBElement<GetInfoById>(_GetInfoById_QNAME, GetInfoById.class, null, value);
    }

}
