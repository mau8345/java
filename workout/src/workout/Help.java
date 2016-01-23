package workout;

public class Help {

	public static void main(String[] args) throws java.io.IOException {
		// TODO Auto-generated method stub
		char choise;
		System.out.println("Help");
		System.out.println("1. if");
		System.out.println("2. switch");
		System.out.println("Choose");
		System.out.println(" ");
		choise = (char) System.in.read();
	
		switch (choise) {
		case '1':
			System.out.print(" if  blablabla");
			break;
		case '2':
			System.out.println("swich blablabla");
			break;
		default:
			System.out.println("not found");
			
		}
		
	}

}
