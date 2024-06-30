package examenT2;

public class ArregloSueldos {
    private double sueldo[];
    private int indice;

    public ArregloSueldos() {
        sueldo = new double[10];
        indice = 0;
    }

    public int tamaño() {
        return indice;
    }

    public double obtener(int p) {
        return sueldo[p];
    }

    public void adicionar(double s) {
        if (indice == tamaño())
            ampliarArreglo();
        sueldo[indice] = s;
        indice++;
    }

    private void ampliarArreglo() {
        double aux[] = sueldo;
        sueldo = new double[indice + 10];
        for (int i = 0; i < indice; i++)
            sueldo[i] = aux[i];
    }
    
    public void eliminarTodo() {
        indice = 0;
    }

    public void eliminarFinal() {
        indice--;
    }

    
    public int posicionPrimerSueldoMenorQue1000() {
    	for (int i = 0; i < tamaño(); i++) {
			if(sueldo[i]>1000 && sueldo[i]<2500) {
				return i;
			}
		}
    	return -1;
    }

    public double sueldoMayor() {
    	double sMayor=0;
    	for (int i = 0; i < tamaño(); i++) {
			if(sMayor<sueldo[i]) {
				sMayor=sueldo[i];
			}
		}
    	return sMayor;
    }
    
    public boolean reemplazarPrimerSueldoMenorQue950() {
    	
    	for (int i = 0; i < tamaño(); i++) {
			if(sueldo[i]<950) {
				sueldo[i]=sueldoMayor();
				return true;
			}
		}
    	return false;
    }
    
    
}
