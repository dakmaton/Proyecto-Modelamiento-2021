package clases;
import java.util.ArrayList;
import clases.Cliente;
public class ArregloClientes {
	ArrayList<Cliente> cli;
	public ArregloClientes(){
		cli=new ArrayList<Cliente>();
		adicionar(new Cliente("Mario Carlini","Cartagena Ponce",11111111,999999999));
	}
	public void adicionar(Cliente x){
		cli.add(x);
	}
	public int tamano() {
		 return cli.size();
	}
	public Cliente obtener(int i) {
		 return cli.get(i);
	}
}
