import java.util.ArrayList;
import java.util.List;

public class Company {
	private String name;
	private int cod;
	private List<Bus> fleet = new ArrayList<>();
	private List<Function> employees = new ArrayList<>();
	public Company(String name, int cod){
		this.name=name;
		this.cod=cod;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public List<Bus> getFleet() {
		return fleet;
	}
	public void setFleet(List<Bus> fleet) {
		this.fleet = fleet;
	}
	public List<Function> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Function> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Company: "+this.name+"Code: "+this.cod;
	}
}
