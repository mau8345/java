package workout;

public class Jp2 {

	public static void main(String[] args)
	throws java.io.IOException{
		// TODO Auto-generated method stub
		char ch, answer = 'S';
		System.out.println("Imagine any character from A to Z");
		System.out.println("");
		ch = (char) System.in.read();
		
		if (ch == answer) 
			System.out.println("Correct!");
		else 
			System.out.println("Wrong");
			if (ch < answer)
				System.out.println("Answer is closer to the end of the alphabet");
			else 
				System.out.println("Answer is closer to the begining of the alphabet");
			
		
	}

}
