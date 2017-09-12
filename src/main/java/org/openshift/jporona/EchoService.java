package org.openshift.jporona;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class EchoService {

	@GET	
	@Path("ping")
	//@Produces({ MediaType.APPLICATION_JSON })	
	public String ping() {
		return "NOP";
	}

}
