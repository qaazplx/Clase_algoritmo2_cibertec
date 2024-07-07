package Problema2;

public class AlquilerAirbnb extends Alquiler {
	
	private int tarifaDiaria;
	
	public AlquilerAirbnb(int codCliente, String nombCliente, int tarifaDiaria,int diasAlquiler) {
		super(codCliente, nombCliente,diasAlquiler);
		this.tarifaDiaria = tarifaDiaria;
	}
	
	public int getTarifaDiaria() {
		return tarifaDiaria;
	}

	public void setTarifaDiaria(int tarifaDiaria) {
		this.tarifaDiaria = tarifaDiaria;
	}

	@Override
	public String caracterizar() {
		// TODO Auto-generated method stub
		return getCodCliente()+"-"+getNombCliente()+"-"+ getDíasAlquiler()+"-"+getTarifaDiaria();
	}

	@Override
	public double costoAlquiler() {
		// TODO Auto-generated method stub
		return getDíasAlquiler()*getTarifaDiaria();
	}
	
	
	
	
}
