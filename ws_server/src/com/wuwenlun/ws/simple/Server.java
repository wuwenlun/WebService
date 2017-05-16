package com.wuwenlun.ws.simple;

import javax.xml.ws.Endpoint;

import com.wuwenlun.ws.simple.card.IDCardImpl;
import com.wuwenlun.ws.simple.weather.WeatherImpl;

public class Server {
	
	public static void main(String[] args) {
		//同一个端口发布多个服务
		String address = "http://127.0.0.1:8080/weather";
		Endpoint.publish(address, new WeatherImpl());
		String address1 = "http://127.0.0.1:8080/idcard";
		Endpoint.publish(address1, new IDCardImpl());
	}

}
