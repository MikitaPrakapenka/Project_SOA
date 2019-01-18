package Gestion_thermo;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.insa.soa.RestProject.Etudiant;
import insat.fr.Salle;

@Path("gestion_thermo")
public class Gestion_Thermo {
	
	
	
	
	@GET
	@Path("/get_temp_in/{idSalle}")
	@Produces(MediaType.APPLICATION_JSON)
	public Salle get_temp_in (@PathParam("idSalle") int id, Object idSalle) {
		
		
		return Salle.getTemperature(idSalle);
	}
	
	
	@GET
	@Path("/get_temp_out")
	@Produces(MediaType.APPLICATION_JSON)
	public Salle get_temp_out () {
		
		
		return getTemperature_out());
	}
	
	@POST
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public void (Etudiant etudNouv) {
		System.out.println("Ajout de l'etudiant  "+etudNouv.getNom()+" "+etudNouv.getPrenom()+" ok" + " et puis Ajout de l'etudiant  "+etudNouv.getBinome().getNom()+" "+etudNouv.getBinome().getPrenom()+" ok");

	}
	
	
	
	
	
	
	
	
	
	

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
}
