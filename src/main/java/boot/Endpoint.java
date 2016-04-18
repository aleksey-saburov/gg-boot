package boot;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

@Produces("application/json")
@Component
@Path("/")
public class Endpoint {
	
	@GET
	public String get() {
		return "Endpoint name is " + this.getClass().getSimpleName();
	}
	

	@GET
	@Path("/help")
	public String help() {
		return "help";
	}
	

}
