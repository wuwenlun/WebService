
package cn.wuwenlun.ws;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WeatherImplTest", targetNamespace = "http://ws.wuwenlun.cn/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WeatherImplTest {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getWeatherByCity", targetNamespace = "http://ws.wuwenlun.cn/", className = "cn.wuwenlun.ws.GetWeatherByCity")
    @ResponseWrapper(localName = "getWeatherByCityResponse", targetNamespace = "http://ws.wuwenlun.cn/", className = "cn.wuwenlun.ws.GetWeatherByCityResponse")
    @Action(input = "http://ws.wuwenlun.cn/WeatherImplTest/getWeatherByCityRequest", output = "http://ws.wuwenlun.cn/WeatherImplTest/getWeatherByCityResponse")
    public String getWeatherByCity(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}