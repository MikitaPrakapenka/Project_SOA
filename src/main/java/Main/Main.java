package Main;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;

import insat.fr.Salle;

public class Main {
	
	@POST
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public void NewSalle (int id) {
		
		
		int temperature =19;
		boolean chauffage= false;
		boolean lumiere= false;
		boolean porte= true;
		boolean fenetre= false;
		boolean presence= true;
		
		Salle newSalle = new Salle(id, temperature, chauffage, lumiere, porte, fenetre, presence);
		System.out.println("Ajout d'une salle  "+newSalle.getid()+" ok" );

	}
	

}
