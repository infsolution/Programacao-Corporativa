import java.util.ArrayList;
import java.util.List;

public class Itinerary {
	private int number;
	private String description;
	private Tipo tipo;
	private List<Bus> fleet = new ArrayList<>();
	private List<BusStop> busStops = new ArrayList<>();
	public Itinerary(int number){
		this.number=number;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public List<Bus> getFleet() {
		return fleet;
	}
	public void setFleet(List<Bus> fleet) {
		this.fleet = fleet;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Code: "+this.number+"\nDescription: "+this.description;
	}
	
}
