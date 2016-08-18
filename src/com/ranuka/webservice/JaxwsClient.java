package com.ranuka.webservice;

public class JaxwsClient {
public static void main(String[] args) {
	HelloWorldImplService helloService = new HelloWorldImplService();
	HelloWorldImpl helloimpl = helloService.getHelloWorldImplPort();
	System.out.println(helloimpl.helloWorld("ranuka s")); 
}
}
