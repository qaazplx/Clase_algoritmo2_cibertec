package arreglo;

import java.util.ArrayList;

import clase.Ingeniero;

public class ArregloIngeniero {

	ArrayList<Ingeniero> ing=new ArrayList<Ingeniero>();
	
	public double  tarifaPromedio() {
		double x=0;
		int conteo=0;
		for (int i = 0; i < ing.size(); i++) {
			if(ing.get(i).getEdad()>40) {
				x=x+ing.get(i).getTarifa();
				conteo++;
			}
		}
		return x/conteo;
	}
	
	public String nombrePrimerIngenieroMenorQue100() {
		
		for (int i = 0; i < ing.size(); i++) {
			if(ing.get(i).getHorasTrabajadas()<100){
				return ing.get(i).getNombre();
				}
			}return null;
		}
}
