package Problema2;

public class Medico {

	private int codigo;
	private double tarifaConsulta;
	private int numConsultas;
	
	private static double ingresosNetosMedicos;
	private static double DESC=0.12;
	
	public Medico(int codigo, double tarifaConsulta, int numConsultas) {
		super();
		this.codigo = codigo;
		this.tarifaConsulta = tarifaConsulta;
		this.numConsultas = numConsultas;
		ingresosNetosMedicos=ingresosNetosMedicos+(ingresoNeto());
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getTarifaConsulta() {
		return tarifaConsulta;
	}

	public void setTarifaConsulta(double tarifaConsulta) {
		this.tarifaConsulta = tarifaConsulta;
	}

	public int getNumConsultas() {
		return numConsultas;
	}

	public void setNumConsultas(int numConsultas) {
		this.numConsultas = numConsultas;
	}

	public static double getIngresosNetosMedicos() {
		return ingresosNetosMedicos;
	}

	public static void setIngresosNetosMedicos(double ingresosNetosMedicos) {
		Medico.ingresosNetosMedicos = ingresosNetosMedicos;
	}

	public static double getDESC() {
		return DESC;
	}

	public static void setDESC(double dESC) {
		DESC = dESC;
	}
	
	public double ingresoBruto() {
		return tarifaConsulta*numConsultas;
	}
	
	public double descuento() {
		return DESC*ingresoBruto();
	}
	
	public double ingresoNeto() {
		return ingresoBruto()-descuento();
	}
	
	
	
}
