package model;

public class Cliente {
	private String name;
	private Compra compra;
	public Cliente(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Compra getCompra() {
		return compra;
	}
	public void setCompra(Compra compra) {
		this.compra = compra;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: "+this.name;
	}
}
