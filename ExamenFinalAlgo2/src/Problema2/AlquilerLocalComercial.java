package Problema2;

import java.lang.invoke.StringConcatFactory;

public class AlquilerLocalComercial extends Alquiler{

	private int mesAlquiler;
	private int metraje;
	
	public AlquilerLocalComercial(int codCliente, String nombCliente, int mesAlquiler, int metraje) {
		super(codCliente, nombCliente);
		this.mesAlquiler=mesAlquiler;
		this.metraje=metraje;
	}

	public int getMesAlquiler() {
		return mesAlquiler;
	}

	public void setMesAlquiler(int mesAlquiler) {
		this.mesAlquiler = mesAlquiler;
	}

	public int getMetraje() {
		return metraje;
	}

	public void setMetraje(int metraje) {
		this.metraje = metraje;
	}


	public int CostoMensual() {
		if(getMetraje()==100) {
			return 5000;
		}else if (getMetraje()==150) {
			return 8000;
		}else 
			return 1200;
	}
	
	@Override
	public String caracterizar() {
		// TODO Auto-generated method stub “codigoCliente-nombreCliente-diasAlquiler-tipoProcesador”
		return getCodCliente()+"-"+getNombCliente()+"-"+ getMesAlquiler();
	}

	@Override
	public double costoAlquiler() {
		// TODO Auto-generated method stub
		return getMesAlquiler()*CostoMensual();
	}
		
}
