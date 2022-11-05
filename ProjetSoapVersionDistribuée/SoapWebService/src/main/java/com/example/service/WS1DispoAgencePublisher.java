package com.example.service;

import java.text.ParseException;

import javax.xml.ws.Endpoint;



public class WS1DispoAgencePublisher {

	public static void main(String[] args) throws ParseException {
		
		Endpoint.publish("http://localhost:8080/servicewebSOAPHotel", new WebserviceImplService());
		Endpoint.publish("http://localhost:8080/webserviceReservation",new webSeviceReservationImpl());
		System.err.println("Server is ready");
		}

}
