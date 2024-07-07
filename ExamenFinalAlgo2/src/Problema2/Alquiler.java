package Problema2;

public abstract class Alquiler implements Caracterizable {

	private int codCliente;
	private String nombCliente;
	private int díasAlquiler;
	
	public Alquiler(int codCliente, String nombCliente, int diasAlquiler) {
		this.díasAlquiler=diasAlquiler;
		this.codCliente = codCliente;
		this.nombCliente = nombCliente;
	}
	
	public Alquiler(int codCliente, String nombCliente) {
		this(codCliente,nombCliente,0);
	}

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	public String getNombCliente() {
		return nombCliente;
	}

	public void setNombCliente(String nombCliente) {
		this.nombCliente = nombCliente;
	}
	
	
	public int getDíasAlquiler() {
		return díasAlquiler;
	}

	public void setDíasAlquiler(int díasAlquiler) {
		this.díasAlquiler = díasAlquiler;
	}

	public abstract double costoAlquiler();
	
	public String caracterizable() {
		return getCodCliente()+"-"+getNombCliente()+"-"+getDíasAlquiler();
	}
	
	
}
