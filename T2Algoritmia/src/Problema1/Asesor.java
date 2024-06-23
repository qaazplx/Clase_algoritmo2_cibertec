package Problema1;

/*
 * Diseñe la clase Asesor en el paquete examen con los atributos privados: nombre del asesor (String), dni (int), codigo (int), 
 * y remuneración en dólares (double) Check. Implemente además: 

-	check - Una variable privada de clase que cuente la cantidad de objetos tipo Asesor creados (int). 
-	Check - Una variable privada de clase que acumule la suma de todas las remuneraciones (double). 
-	Check - Una constante pública de clase para el nombre de la institución (String). 
-	Check - Un constructor que inicialice a todos los atributos, cuente la cantidad de objetos creados y acumule todas las remuneraciones. 
-	Check - Un constructor con dos parámetros que inicialice sólo los atributos nombre y dni, invocando al primer constructor
	, enviando con el valor 55555 el código y con 2000.0 la remuneración en dólares. 
- 	Check - Un constructor sin parámetros que	invoque al segudo constructor, enviando con “NN” el nombre del asesor y con 88888888 el número del dni.
-	Check - Métodos de acceso público set/get para todos los atributos privados. 
-	Check - Métodos públicos de clase set/get para las variables privadas de clase.

 */


public class Asesor {
	
	private String NombreAsesor;
	private int dni;
	private int codigo;
	private double RemDol;

	private static int cantObjAsesor;
	private static double sumRem;
	
	public static String nomInst = "CIBERTEC";

	public Asesor(String nombreAsesor, int dni, int codigo, double remDol) {
		NombreAsesor = nombreAsesor;
		this.dni = dni;
		this.codigo = codigo;
		RemDol = remDol;
		cantObjAsesor++;
		sumRem=sumRem+RemDol;
	}

	public Asesor(String nombreAsesor, int dni) {
		this(nombreAsesor,dni,5555,2000.0);
	}
	
	public Asesor() {
		this("NN",88888888);
	}

	public String getNombreAsesor() {
		return NombreAsesor;
	}

	public void setNombreAsesor(String nombreAsesor) {
		NombreAsesor = nombreAsesor;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getRemDol() {
		return RemDol;
	}

	public void setRemDol(double remDol) {
		RemDol = remDol;
	}

	public static int getCantObjAsesor() {
		return cantObjAsesor;
	}

	public static void setCantObjAsesor(int cantObjAsesor) {
		Asesor.cantObjAsesor = cantObjAsesor;
	}

	public static double getSumRem() {
		return sumRem;
	}

	public static void setSumRem(double sumRem) {
		Asesor.sumRem = sumRem;
	}

	public static String getNomInst() {
		return nomInst;
	}

	public static void setNomInst(String nomInst) {
		Asesor.nomInst = nomInst;
	}
	
	
	
	
	
}
