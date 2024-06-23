package Problema2;

public class ArregloNotas {
	
	double notas[]=new double[15];
	int indice=0;
	
	public ArregloNotas() {
		notas[indice]=1;
		notas[indice++]=5;
		notas[indice++]=10.5;
		notas[indice++]=8;
		notas[indice++]=12;
		notas[indice++]=15;
		notas[indice++]=18;
		notas[indice++]=22;
		notas[indice++]=26;
	}

	

	public int buscar(double x) {
		for (int i = 0; i < notas.length; i++) {
			if(notas[i]==x) {
				return i;
			}
		}return -1;
	}
	

	public int posicionPrimeraNotaMayor16() {
		for (int i = 0; i < notas.length; i++) {
			if(notas[i]>16) {
				return i;
			}
		}return -1;
	}

	
	public double sumarNotas() {
		double suma=0;
		
		for (int i = 0; i < notas.length; i++) {
			suma=suma+notas[i];
		}return suma;
	}

	
	public double retornarNotaMayor() {
		double nota=0;
		for (int i = 0; i < notas.length; i++) {
			if(nota<notas[i]) {
				nota=notas[i];
			}
		}return nota;
	}
	
	public Boolean reemplazarNota10_5() {
		for (int i = 0; i < notas.length; i++) {
			if(buscar(10.5)!=-1) {
				notas[buscar(10.5)]=retornarNotaMayor();
				return true;
			}
		}return false;
	}
	
	public Boolean incrementarNotaMayor16() {
		
		if(posicionPrimeraNotaMayor16()!=-1) {
			int posicion=posicionPrimeraNotaMayor16();
			notas[posicion]=notas[posicion]+(retornarNotaMayor()*0.20);
			return true;
		}return false;
	}

}
