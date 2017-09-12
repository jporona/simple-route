package org.openshift.jporona;
import org.apache.camel.spring.SpringRouteBuilder;


public class SimpleRoute extends SpringRouteBuilder {


	@Override
	public void configure() throws Exception {
		System.out.println("oka oka ");
		from("timer://foo?fixedRate=true&period=10000")
		.setBody().constant("ok1111")
		.to("log:jporona");		
		
		from("cxfrs://http://localhost:8080?resourceClasses=org.openshift.jporona.EchoService")
		.setBody().constant("oka jporona")
		.convertBodyTo(String.class);
		
		
	}
	
	
	

}
