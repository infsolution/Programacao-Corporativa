package model;

public class Concessao {
	private int numero;
	private Rota rota;
	private EmpresaAerea empresa;
	public Concessao(int numero){
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
	public EmpresaAerea getEmpresa() {
		return empresa;
	}
	public void setEmpresa(EmpresaAerea empresa) {
		this.empresa = empresa;
	}
	
}
