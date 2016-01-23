package module2;

public class VehicleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int range1, range2;
		Vehicle minivan = new Vehicle ();
		Vehicle sportcar = new Vehicle ();
		minivan.passangers = 7;
		minivan.fuelcap = 66;
		minivan.gpm = 21;
		//range1 = minivan.fuelcap * minivan.gpm;
		//System.out.println("Minivan can deliver " + minivan.passangers + " passangers on the distance of " + range1 + " miles");
		minivan.range();
		sportcar.range();
		
		sportcar.passangers = 2;
		sportcar.fuelcap = 44;
		sportcar.gpm = 12;
		//range2 = sportcar.fuelcap * sportcar.gpm;
		//System.out.println("Sportcar can deliver 2 passangers on the distance of " + range2 + " miles");
		
		
	}

}
