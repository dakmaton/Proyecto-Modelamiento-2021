package clases;
import java.util.ArrayList;
import clases.Trabajador;
public class ArregloTrabajadores {
	private ArrayList <Trabajador> tra;
	public ArregloTrabajadores(){
		tra=new ArrayList<Trabajador> ();
		adicionar(new Trabajador("Giaco","LUNES-MARTES"));
		adicionar(new Trabajador("Marco","JUEVES-VIERNES"));
		adicionar(new Trabajador("Mariah","MIERCOLES-SABADO"));
	}
	
	public void adicionar(Trabajador x){
		tra.add(x);
	}
	public int tamano(){
		return tra.size();
	}
	public Trabajador obtener(int i){
		return tra.get(i);
	}
	public void set(int i,Trabajador x){
		tra.set(i,x);
	}
	public void eliminar(int i){
		tra.remove(i);
	}
}
