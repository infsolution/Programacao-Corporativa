package model;

public class Office extends User implements Login{
	private int codCargo;
	public Office(String name, int codCargo) {
		super(name);
		this.codCargo=codCargo;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean getLogin(Cargo cargo) {
		// TODO Auto-generated method stub
		if(cargo == Cargo.GERENTE){
			return true;
		}else{
			return false;
		}
	}	
}
