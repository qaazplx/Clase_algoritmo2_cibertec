package arreglos;

import java.util.ArrayList;
import Clases.Empleados;

public class ArregloPersonas {

	private static ArrayList<Empleados> per= new ArrayList<>();

	/* 

- Un método buscar que busque un dni y retorne la dirección de memoria del objeto que lo contiene. En caso no exista retorne null. 
*/
	
	
	
	public void ArregloPersonas(ArrayList<Empleados> per) {
	
	} 
	
	public void adicionar(Empleados x) {
		getPer().add(x);
	}
	
	public int tamanio() {
		return getPer().size();
	}
	
	public Empleados objetoEnPos(int x) {
		return getPer().get(x);
	}
	
	public void eliminar(int x) {
		getPer().remove(x);
	}
	
	public Empleados buscarCodigo(int x) {
		
		for (int i = 0; i <tamanio() ; i++) {
			if(objetoEnPos(i).getCodigo()==x) {
				return objetoEnPos(i);
			}
		}return null;
	}
	
	public Empleados buscarDni(String x) {
		
		for (int i = 0; i <tamanio() ; i++) {
			if(objetoEnPos(i).getDni().equals(x)) {
				return objetoEnPos(i);
			}
		}return null;
	}

	public static ArrayList<Empleados> getPer() {
		return per;
	}

	public void setPer(ArrayList<Empleados> per) {
		this.per = per;
	}
	
	
}
