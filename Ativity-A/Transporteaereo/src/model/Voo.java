package model;

public class Voo {
	private int numero;
	private Rota rota;
	private Aeronave aeronave;
	public Voo(int numero){
		this.numero=numero;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Rota getRota() {
		return rota;
	}
	public void setRota(Rota rota) {
		this.rota = rota;
	}
	public Aeronave getAeronave() {
		return aeronave;
	}
	public void setAeronave(Aeronave aeronave) {
		this.aeronave = aeronave;
	}
	
}
