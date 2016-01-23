package module2;

public class Vehicle {
int passangers;
int fuelcap;
int gpm;
int range2()
{return gpm * fuelcap;	}

double fuelneeded(int miles){
	return (double) miles / gpm;}

void range() {
	System.out.println("Range = " + fuelcap * gpm + " miles");
}
}
