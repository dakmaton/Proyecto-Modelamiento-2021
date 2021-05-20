package clases;

public class Cliente {
private String nom_cli,ape_cli;
private int dni_cli;
private double tel_cli;
public Cliente(String nom_cli, String ape_cli, int dni_cli, double tel_cli) {
	this.nom_cli = nom_cli;
	this.ape_cli = ape_cli;
	this.dni_cli = dni_cli;
	this.tel_cli = tel_cli;
}
public String getNom_cli() {
	return nom_cli;
}
public void setNom_cli(String nom_cli) {
	this.nom_cli = nom_cli;
}
public String getApe_cli() {
	return ape_cli;
}
public void setApe_cli(String ape_cli) {
	this.ape_cli = ape_cli;
}
public int getDni_cli() {
	return dni_cli;
}
public void setDni_cli(int dni_cli) {
	this.dni_cli = dni_cli;
}
public double getTel_cli() {
	return tel_cli;
}
public void setTel_cli(double tel_cli) {
	this.tel_cli = tel_cli;
}

}
