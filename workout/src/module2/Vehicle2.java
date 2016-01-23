package module2;
public class Vehicle2 {
public static void main (String args[]){
	//fuelcap2
	Vehicle minivan = new Vehicle();
	Vehicle sportscar = new Vehicle();
	double gallons;
	int distance = 252;
	minivan.passangers = 7;
	minivan.fuelcap = 16;
	minivan.gpm = 21;
	
	sportscar.passangers = 2;
	sportscar.fuelcap = 14;
	sportscar.gpm = 12;
	gallons = minivan.fuelneeded(distance);
	System.out.println(gallons + " gallons is neccesary to drive " + distance + " miles in minivan" );
gallons = sportscar.fuelneeded(distance);
System.out.println(gallons + " for sportscar for the same distance");
}
}
