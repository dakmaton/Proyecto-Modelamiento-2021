package clases;
import java.util.ArrayList;
import clases.Producto;
public class ArregloProductos {
private ArrayList <Producto> pro;
	
	public ArregloProductos(){
		pro=new ArrayList<Producto> ();
		adicionar(new Producto(101,"SHOR","LIMOBASICS",10,10.00));
		adicionar(new Producto(102,"CAMISA","SAY PLEASES",50,15.00));
		adicionar(new Producto(103,"GORRO","HELLO PETIT",10,30.00));
	}
	
	public void adicionar(Producto x){
		pro.add(x);
	}
	public int tamano(){
		return pro.size();
	}
	public Producto obtener(int i){
		return pro.get(i);
	}
	public Producto buscar(int serie_p) {
		 for (int i=0; i<tamano(); i++)
			 if (obtener(i).getSerie_p() == serie_p)
				 return obtener(i);
		 return null;
	}
	public void set(int i,Producto x){
		pro.set(i,x);
	}
	public void eliminar(int i){
		pro.remove(i);
	}
}
