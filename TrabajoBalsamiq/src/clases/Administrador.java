package clases;

public class Administrador {
private String nom_adm, ape_adm, correo_adm, usu_adm, con_adm;
private int dni_adm;
private double telf_adm;
public Administrador(String nom_adm, String ape_adm, String correo_adm, String usu_adm, String con_adm, int dni_adm,
		double telf_adm) {
	this.nom_adm = nom_adm;
	this.ape_adm = ape_adm;
	this.correo_adm = correo_adm;
	this.usu_adm = usu_adm;
	this.con_adm = con_adm;
	this.dni_adm = dni_adm;
	this.telf_adm = telf_adm;
}
public String getNom_adm() {
	return nom_adm;
}
public void setNom_adm(String nom_adm) {
	this.nom_adm = nom_adm;
}
public String getApe_adm() {
	return ape_adm;
}
public void setApe_adm(String ape_adm) {
	this.ape_adm = ape_adm;
}
public String getCorreo_adm() {
	return correo_adm;
}
public void setCorreo_adm(String correo_adm) {
	this.correo_adm = correo_adm;
}
public String getUsu_adm() {
	return usu_adm;
}
public void setUsu_adm(String usu_adm) {
	this.usu_adm = usu_adm;
}
public String getCon_adm() {
	return con_adm;
}
public void setCon_adm(String con_adm) {
	this.con_adm = con_adm;
}
public int getDni_adm() {
	return dni_adm;
}
public void setDni_adm(int dni_adm) {
	this.dni_adm = dni_adm;
}
public double getTelf_adm() {
	return telf_adm;
}
public void setTelf_adm(double telf_adm) {
	this.telf_adm = telf_adm;
}

}
