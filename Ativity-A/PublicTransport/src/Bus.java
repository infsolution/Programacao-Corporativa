
public class Bus {
private int number;
private int codeItinerary;
private Driver driver;
private Conductor conductor;
public Bus(int number){
	this.number=number;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public int getCodeItinerary() {
	return codeItinerary;
}
public void setCodeItinerary(int codeItinerary) {
	this.codeItinerary = codeItinerary;
}
public Driver getDriver() {
	return driver;
}
public void setDriver(Driver driver) {
	this.driver = driver;
}
public Conductor getConductor() {
	return conductor;
}
public void setConductor(Conductor conductor) {
	this.conductor = conductor;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Number: "+this.number+"\nIntinerary: "+this.codeItinerary;
	}
}
