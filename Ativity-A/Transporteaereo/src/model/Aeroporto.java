package model;

public class Aeroporto {
	private String nome;
	private String local;
	public Aeroporto(String nome){
		this.nome=nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
}
