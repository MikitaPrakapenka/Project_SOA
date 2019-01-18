package insat.fr;

public class Salle {
	
	private double temperature;
	private boolean chauffage;
	private boolean lumiere;
	private boolean porte;
	private boolean fenetre;
	private boolean presence;
	
	public Salle(double temperature, boolean chauffage, boolean lumiere, boolean porte, boolean fenetre,
			boolean presence) {
		super();
		this.temperature = temperature;
		this.chauffage = chauffage;
		this.lumiere = lumiere;
		this.porte = porte;
		this.fenetre = fenetre;
		this.presence = presence;
	}
	
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public boolean isChauffage() {
		return chauffage;
	}
	public void setChauffage(boolean chauffage) {
		this.chauffage = chauffage;
	}
	public boolean isLumiere() {
		return lumiere;
	}
	public void setLumiere(boolean lumiere) {
		this.lumiere = lumiere;
	}
	public boolean isPorte() {
		return porte;
	}
	public void setPorte(boolean porte) {
		this.porte = porte;
	}
	public boolean isFenetre() {
		return fenetre;
	}
	public void setFenetre(boolean fenetre) {
		this.fenetre = fenetre;
	}
	public boolean isPresence() {
		return presence;
	}
	public void setPresence(boolean presence) {
		this.presence = presence;
	}
	
}
