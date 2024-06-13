package Problema1;

public class Cilindro {
	private double radio;
	private double altura;
	
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public Cilindro(double radio, double altura) {
		super();
		this.radio = radio;
		this.altura = altura;
	}
	
	public double VolumenTotal() {
		return (3.1416*radio*radio)*altura;
	}

}
