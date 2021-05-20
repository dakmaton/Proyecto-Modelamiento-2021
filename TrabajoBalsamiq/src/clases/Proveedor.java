package clases;

public class Proveedor {
private String nom_prov,nom_pro_prov;
private double pre_prov;
public Proveedor(String nom_prov, String nom_pro_prov, double pre_prov) {
	this.nom_prov = nom_prov;
	this.nom_pro_prov = nom_pro_prov;
	this.pre_prov = pre_prov;
}
public String getNom_prov() {
	return nom_prov;
}
public void setNom_prov(String nom_prov) {
	this.nom_prov = nom_prov;
}
public String getNom_pro_prov() {
	return nom_pro_prov;
}
public void setNom_pro_prov(String nom_pro_prov) {
	this.nom_pro_prov = nom_pro_prov;
}
public double getPre_prov() {
	return pre_prov;
}
public void setPre_prov(double pre_prov) {
	this.pre_prov = pre_prov;
}

}
