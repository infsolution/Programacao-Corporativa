package model;

public enum Cargo {
	SECRETARIA(1),VENDEDOR(2),GERENTE(3),DIRETOR(4);
	private int id;
	private Cargo(int id){
		this.id=id;
	}
	public static Cargo cargoInt(int i){
		switch (i) {
		case 1:
			return Cargo.SECRETARIA;
		case 2:
			return Cargo.VENDEDOR;
		case 3:
			return Cargo.GERENTE;
		case 4:
			return Cargo.DIRETOR;
		default:
			throw new IllegalArgumentException();
		}
}
	public static Cargo cargoString(int i){
		switch (i) {
		case 1:
			return Cargo.SECRETARIA;
		case 2:
			return Cargo.VENDEDOR;
		case 3:
			return Cargo.GERENTE;
		case 4:
			return Cargo.DIRETOR;
		default:
			throw new IllegalArgumentException();
		}
}
}
