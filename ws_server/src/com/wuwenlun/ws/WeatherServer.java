package com.wuwenlun.ws;

import javax.xml.ws.Endpoint;

public class WeatherServer {
	
	public static void main(String[] args) {
		String address = "http://127.0.0.1:12345/weather";
		Endpoint.publish(address, new WeatherImpl());
	}

}
