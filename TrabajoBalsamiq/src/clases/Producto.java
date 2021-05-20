package clases;

public class Producto {
private int serie_p,stock_p;;
private String nom_p, marca_p;
private double pre_p;
public Producto(int serie_p, String nom_p, String marca_p, int stock_p, double pre_p) {
	this.serie_p = serie_p;
	this.nom_p = nom_p;
	this.marca_p = marca_p;
	this.stock_p = stock_p;
	this.pre_p = pre_p;
}
public int getSerie_p() {
	return serie_p;
}
public void setSerie_p(int serie_p) {
	this.serie_p = serie_p;
}
public String getNom_p() {
	return nom_p;
}
public void setNom_p(String nom_p) {
	this.nom_p = nom_p;
}
public String getMarca_p() {
	return marca_p;
}
public void setMarca_p(String marca_p) {
	this.marca_p = marca_p;
}
public int getStock_p() {
	return stock_p;
}
public void setStock_p(int stock_p) {
	this.stock_p = stock_p;
}
public double getPre_p() {
	return pre_p;
}
public void setPre_p(double pre_p) {
	this.pre_p = pre_p;
}

}
