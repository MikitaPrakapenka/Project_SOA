package fr.insa.soa.Project_SOA;

public class Salle {
	
	private double id;
	private double temperature_in;
	private double temperature_out;
	private boolean chauffage;
	private boolean lumiere;
	private boolean porte;
	private boolean fenetre;
	private boolean presence;
	
	public Salle(double id, double temperature_in, double temperature_out, boolean chauffage, boolean lumiere, boolean porte, boolean fenetre,
			boolean presence) {
		
		super();
		this.id=id;
		this.temperature_in = temperature_in;
		this.temperature_out = temperature_out;
		this.chauffage = chauffage;
		this.lumiere = lumiere;
		this.porte = porte;
		this.fenetre = fenetre;
		this.presence = presence;
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public double getTemperature_in() {
		return temperature_in;
	}

	public void setTemperature_in(double temperature_in) {
		this.temperature_in = temperature_in;
	}

	public double getTemperature_out() {
		return temperature_out;
	}

	public void setTemperature_out(double temperature_out) {
		this.temperature_out = temperature_out;
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
	
	public void onAlarm(){
		System.out.println("alarm on");
	}
	
	
	
}