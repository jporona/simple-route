import org.apache.camel.spring.SpringRouteBuilder;


public class SimpleRoute extends SpringRouteBuilder {


	@Override
	public void configure() throws Exception {
		System.out.println("oka oka ");
		from("timer://foo?fixedRate=true&period=10000").
		to("log:prueba");		
	}
	
	
	

}
