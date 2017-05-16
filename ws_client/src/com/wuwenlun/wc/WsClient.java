package com.wuwenlun.wc;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import cn.wuwenlun.ws.TestHa;
import cn.wuwenlun.ws.WeatherImplTest;

public class WsClient {

	public static void main(String[] args) throws MalformedURLException {
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
		WeatherImplTest testService1 = service.getPort(portName, WeatherImplTest.class);
		System.out.println(testService1.getWeatherByCity("广州"));
	}
	
}
