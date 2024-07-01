package Clases;

public class Empleados {
	
	/*Diseñe la clase Empleados en el paquete clases con los atributos privados: codigo (int), nombre (String),
	dni (String), cantidad de ventas (int), comisión por venta (double) y estado (int). Implemente además */

	private int codigo;
	private String nombre;
	private String dni;
	private int cantidadVentas;
	private double comisionxVenta;
	private int estado;
	
	public Empleados(int codigo, String nombre, String dni, int cantidadVentas, double comisionxVenta, int estado) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.dni = dni;
		this.cantidadVentas = cantidadVentas;
		this.comisionxVenta = comisionxVenta;
		this.estado = estado;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getCantidadVentas() {
		return cantidadVentas;
	}

	public void setCantidadVentas(int cantidadVentas) {
		this.cantidadVentas = cantidadVentas;
	}

	public double getComisionxVenta() {
		return comisionxVenta;
	}

	public void setComisionxVenta(double comisionxVenta) {
		this.comisionxVenta = comisionxVenta;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	/*- Un constructor que inicialice a todos los atributos. 
- Métodos de acceso público set/get para todos los atributos privados. Use la referencia this. 
- Método público que retorne el sueldo bruto: sueldo bruto = cantidad de ventas * comisión por venta.
*/
	public double sueldoBruto() {
		return this.cantidadVentas*this.comisionxVenta;
	}	
	
}
