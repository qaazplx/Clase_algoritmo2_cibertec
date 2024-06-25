package Clases;

public class Venta {

	private int codigoVenta=3001; //autogenerado
	private int codigoCliente;//se envia por formulario
	private int codigoProducto;//se envia por formulario
	private int cantidad; //se envia por formulario
	private int precio;// se envia el monto por formulario cantidad * precio unitario o el precio x unidad
	private String fecha;//formato de fecha: mm/dd/aaaa
	
	private static int contador=0;

	public Venta(int codigoVenta, int codigoCliente, int codigoProducto, int cantidad, int precio, String fecha) {
		this.codigoVenta = this.codigoVenta+codigoVenta;
		this.codigoCliente = codigoCliente;
		this.codigoProducto = codigoProducto;
		this.cantidad = cantidad;
		this.precio = precio;
		this.fecha = fecha;
	}

	public Venta(int codigoCliente, int codigoProducto, int cantidad, int precio, String fecha) {
		this(contador++,codigoCliente,codigoProducto,cantidad,precio,fecha);
	}

	public int getCodigoVenta() {
		return codigoVenta;
	}

	public void setCodigoVenta(int codigoVenta) {
		this.codigoVenta = codigoVenta;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Venta.contador = contador;
	}
	
}
