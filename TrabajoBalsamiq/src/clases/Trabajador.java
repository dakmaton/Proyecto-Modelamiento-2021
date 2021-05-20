package clases;

public class Trabajador {
	private String nom_tra,turno_tra;
	public Trabajador(String nom_tra, String turno_tra) {
		this.nom_tra = nom_tra;
		this.turno_tra = turno_tra;
	}

	public String getNom_tra() {
		return nom_tra;
	}

	public void setNom_tra(String nom_tra) {
		this.nom_tra = nom_tra;
	}

	public String getTurno_tra() {
		return turno_tra;
	}

	public void setTurno_tra(String turno_tra) {
		this.turno_tra = turno_tra;
	}

}
