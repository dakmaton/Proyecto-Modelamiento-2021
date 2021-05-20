package clases;
import java.util.ArrayList;
import clases.Proveedor;
public class ArregloProveedores {
	private ArrayList <Proveedor> prov;
	public ArregloProveedores(){
		prov=new ArrayList<Proveedor> ();
		adicionar(new Proveedor("Giacomo Guillizzoni","PANTALONES",40));
		adicionar(new Proveedor("Marco Botton","POLOS",35));
		adicionar(new Proveedor("Mariah Maclachian","SHORT",50));
	}
	
	public void adicionar(Proveedor x){
		prov.add(x);
	}
	public int tamano(){
		return prov.size();
	}
	public Proveedor obtener(int i){
		return prov.get(i);
	}
	public void set(int i,Proveedor x){
		prov.set(i,x);
	}
	public void eliminar(int i){
		prov.remove(i);
	}
}
