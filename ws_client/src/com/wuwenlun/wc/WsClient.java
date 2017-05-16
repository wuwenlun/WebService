package com.wuwenlun.wc;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.wuwenlun.ws.simple.card.IDCardImpl;

import cn.wuwenlun.ws.TestHa;
import cn.wuwenlun.ws.WeatherImplTest;

public class WsClient {

	public static void main(String[] args) throws MalformedURLException {
		/**
		 * 
		 *服务一 
		 * 
		 */
		TestHa service = new TestHa();
		//The first method of implementation
		WeatherImplTest weatherService = service.getWeatherPortImp();
		String rsp = weatherService.getWeatherByCity("北京");
		System.out.println(rsp);
		
		//The second method of implementation
		QName portName = new QName("http://ws.wuwenlun.cn/","WeatherPortImp");
		WeatherImplTest testService = service.getPort(portName, WeatherImplTest.class);
		String resp = testService.getWeatherByCity("天津");
		System.out.println(resp);
		
		//The third method of implementation
		URL url = new URL("http://127.0.0.1:12345/weather");
		QName qname = new QName("http://ws.wuwenlun.cn/","TestHa");
		Service soap = Service.create(url, qname);
		QName portName1 = new QName("http://ws.wuwenlun.cn/","WeatherPortImp");
		WeatherImplTest testService1 = soap.getPort(portName1, WeatherImplTest.class);
		System.out.println(testService1.getWeatherByCity("广州"));
		
		/**
		 * 
		 * 
		 *服务二 
		 * 
		 */
		URL url1 = new URL("http://127.0.0.1:12345/idcard");
		QName qname1 = new QName("http://card.simple.ws.wuwenlun.com/","IDCardImplService");
		Service soap1 = Service.create(url1, qname1);
		QName portName2 = new QName("http://card.simple.ws.wuwenlun.com/","IDCardImplPort");
		IDCardImpl testService2 = soap1.getPort(portName2, IDCardImpl.class);
		System.out.println(testService2.getInfoById("122345667443"));
	}
	
}
