
public class Employee {
	private String name;
	private int registration;
	private String function;
	public Employee(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRegistration() {
		return registration;
	}
	public void setRegistration(int registration) {
		this.registration = registration;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+this.name+"\nRegistration: "+this.registration;
	}
}
