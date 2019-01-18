/*package insat.fr;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

public class TestRest {
	
	public static void main (String[] args)
	{
		Client client= ClientBuilder.newClient();
		Response response=client.target("http://localhost:8080/RestWS/insaRessources/comparator/longueurDouble?chaine=toro").request().get();
		System.out.println(response.readEntity(String.class));
	}
	
	

}
*/