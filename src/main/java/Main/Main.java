package Main;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import insat.fr.Salle;

public class Main {
	
	@GET
	@Path("/{idSalle}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Salle NewSalle (@PathParam("idSalle") int id) {
		
		
		int temperature =19;
		boolean chauffage= false;
		boolean lumiere= false;
		boolean porte= true;
		boolean fenetre= false;
		boolean presence= true;
		
		for (int i = 1; i<4; i++) {
			
			if (i==1) {
				
				Salle newSalle1 = new Salle(id+(i*2), temperature+(i*3), chauffage, lumiere, porte, fenetre, presence);
				System.out.println("Ajout d'une salle  "+newSalle1.getid()+" ok" );
			}
			
			if (i==2) {
				
				Salle newSalle2 = new Salle(id+(i*2), temperature+(i*3), chauffage, lumiere, porte, fenetre, presence);
				System.out.println("Ajout d'une salle  "+newSalle2.getid()+" ok" );
			}
			
			if (i==3) {
				
				Salle newSalle3 = new Salle(id+(i*2), temperature+(i*3), chauffage, lumiere, porte, fenetre, presence);
				System.out.println("Ajout d'une salle  "+newSalle3.getid()+" ok" );
				return newSalle3;
			}
			
			
			
		}
		
				
		Salle newSalle4 = new Salle(id, temperature, chauffage, lumiere, porte, fenetre, presence);
		//System.out.println("Ajout d'une salle  "+newSalle3.getid()+" ok" );
		return newSalle4;

	}
	
	

}
