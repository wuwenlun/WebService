package com.wuwenlun.ws.simple.weather;

import javax.jws.WebService;

@WebService(name="WeatherImplTest",portName="WeatherPortImp",serviceName="TestHa",targetNamespace="http://ws.wuwenlun.cn/")
public class WeatherImpl implements WeatherInterface{

	@Override
	public String getWeatherByCity(String city) {
		System.out.println("accept msg from client!! the city is " + city);
		String resmsg = city+"天气晴朗。";
		System.out.println("返回消息："+resmsg);
		return resmsg;
	}

}
