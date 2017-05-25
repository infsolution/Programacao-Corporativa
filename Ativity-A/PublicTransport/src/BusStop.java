
public class BusStop {
	private int number;
	private int[] coordinates = new int[2];
	private String description;
	public BusStop(int number){
		this.number=number;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int[] getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(int[] cordinates) {
		this.coordinates = cordinates;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Number: "+this.number+"\nDescription: "+this.description;
	}

}
