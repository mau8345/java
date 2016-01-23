package workout;

public class Break6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		
		stop1: for (x = 0; x < 10; x++){
			for (y = 0; y < 10; y++){
				if (y == 2) break stop1;
				System.out.println(x + "  " + y);
			}}
		for (x = 0; x < 10; x++)
		stop2:{
			for (y = 0; y < 10; y++){
				if (y == 2) break stop2;
				System.out.println("X and Y " + x + " " + y);
			}
		}}
	}
