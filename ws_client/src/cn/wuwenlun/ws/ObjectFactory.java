
package cn.wuwenlun.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.wuwenlun.ws package. 
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

    private final static QName _GetWeatherByCity_QNAME = new QName("http://ws.wuwenlun.cn/", "getWeatherByCity");
    private final static QName _GetWeatherByCityResponse_QNAME = new QName("http://ws.wuwenlun.cn/", "getWeatherByCityResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.wuwenlun.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetWeatherByCity }
     * 
     */
    public GetWeatherByCity createGetWeatherByCity() {
        return new GetWeatherByCity();
    }

    /**
     * Create an instance of {@link GetWeatherByCityResponse }
     * 
     */
    public GetWeatherByCityResponse createGetWeatherByCityResponse() {
        return new GetWeatherByCityResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeatherByCity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wuwenlun.cn/", name = "getWeatherByCity")
    public JAXBElement<GetWeatherByCity> createGetWeatherByCity(GetWeatherByCity value) {
        return new JAXBElement<GetWeatherByCity>(_GetWeatherByCity_QNAME, GetWeatherByCity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeatherByCityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wuwenlun.cn/", name = "getWeatherByCityResponse")
    public JAXBElement<GetWeatherByCityResponse> createGetWeatherByCityResponse(GetWeatherByCityResponse value) {
        return new JAXBElement<GetWeatherByCityResponse>(_GetWeatherByCityResponse_QNAME, GetWeatherByCityResponse.class, null, value);
    }

}
