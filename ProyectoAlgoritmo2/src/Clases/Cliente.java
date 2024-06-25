package Clases;

public class Cliente {

	private int codigoCliente=1001;
	private String nombres;
	private String apellidos;
	private String direccion;
	private String telefono;
	private String dni;
	
	private static int contador=0;
	
	public Cliente(int codigoCliente,String nombres, String apellidos, String direccion, String telefono, String dni) {
		this.codigoCliente=this.codigoCliente+codigoCliente;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.dni = dni;
	}

	public Cliente(String nombres, String apellidos, String direccion, String telefono, String dni) {
		this(contador++,nombres,apellidos, direccion,telefono,dni);
	}
	
	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
}
