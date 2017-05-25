
public enum Tipo {
	CIRCULAR(1),DIAMETRAL(2),RADIAL(3);
	private int id;
	private Tipo(int id){
		this.id=id;
	}
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public static Tipo setTipoInt(int t){
		switch(t){
		case 1:
			return Tipo.CIRCULAR;
		case 2:
			return Tipo.DIAMETRAL;
		case 3:
			return Tipo.RADIAL;
		default:
			throw new IllegalArgumentException();
		}
	}
	public static Tipo setTipoString(String t){
		switch(t){
		case "CIRCULAR":
			return Tipo.CIRCULAR;
		case "DIAMETRAL":
			return Tipo.DIAMETRAL;
		case "RADIAL":
			return Tipo.RADIAL;
		default:
			throw new IllegalArgumentException();
		}
	}
}
