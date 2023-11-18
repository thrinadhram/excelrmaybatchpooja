	package classandobjects;

public class carclassandobjects {
	int number;
	String name;
	String colour;
static String carname =" benz";

	public void cardriving() {
		System.out.println("drivingthecar");
		
	}
public void carracing() {
	System.out.println("car is in the racing");
	
}
public static void main(String[] args) {
	carclassandobjects c1 = new carclassandobjects();
	c1.number = 12;
	c1.name = "benz";
	c1.colour="black";
	c1.cardriving();
	System.out.println(c1.number);
	System.out.println(c1.name);
	System.out.println(c1.colour);
}

}
