package clases;
import java.util.ArrayList;
import clases.Administrador;
public class ArregloAdministradores {
	ArrayList<Administrador> usu;
	public ArregloAdministradores(){
		usu=new ArrayList<Administrador>();
		adicionar(new Administrador("Pedro Isaia","Ramirez Lopez","Pedrito123@gmail.com","Pedrito12","1234",1020304,908070605));
	}
	public void adicionar(Administrador x){
		usu.add(x);
	}
	public int tamano() {
		 return usu.size();
	}
	public Administrador obtener(int i) {
		 return usu.get(i);
	}
}
