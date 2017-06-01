package model;

public class Reaction {
	private long id;
	private String tipo;
	public Reaction(String tipo){
		this.tipo=tipo;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.tipo;
	}
}
