package workout;

public class Help2 {

	public static void main(String[] args)
	throws java.io.IOException{
		char choice, ignore;
		
		do {
			System.out.println("Help");
			System.out.println(" 1. If");
			System.out.println(" 2. For");
			System.out.println(" 3. While");
			System.out.println(" 4. Switch");
			System.out.println(" 5. Do-while");
			System.out.println("Choose: ");
			choice = (char) System.in.read();
			
			do
			{ignore = (char) System.in.read();
			}while (ignore != '\n');
			}while (choice < '1' | choice > '5');
		
		switch (choice){
		case '1':
			System.out.println(" 1. If operator");
			break;
		case '2':
			System.out.println(" 2. For operator");
			break;
		case '3':
			System.out.println(" 3. While operator");
			break;
		case '4':
			System.out.println(" 4. Switch operator");
			break;
		case '5':
			System.out.println(" 5. Do-while operator");
			break;
		}
		// TODO Auto-generated method stub
		

	}

}
