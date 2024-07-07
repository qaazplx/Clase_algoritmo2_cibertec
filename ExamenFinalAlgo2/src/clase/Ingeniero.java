package clase;

public class Ingeniero {

	private String nombre;
	private int codigo;//sera una secuencia
	private int edad;
	private double tarifa;
	private double horasTrabajadas;
	
	public Ingeniero(String nombre, int codigo, int edad, double tarifa, double horasTrabajadas) {
		
		this.nombre = nombre;
		this.codigo = codigo;
		this.edad = edad;
		this.tarifa = tarifa;
		this.horasTrabajadas = horasTrabajadas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	
	
	
}
