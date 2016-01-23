package workout;

public class QCycle2 {
	public static void main (String agrs[])
	throws java.io.IOException 
	{
		char ch, ignore;
		for ( ; ; ) {
		//first program for letter guessing;
		ch = (char) System.in.read();
		do{ignore = (char) System.in.read();}
		while (ignore != '\n');
		System.out.println("Your letter is " + ch);
		if (ch == 'q') break;
			else System.out.println("You type a wrong letter. Please try egain.");
		}   System.out.println("You type right letter");
		
		//second program for cycle calculation;
		for (int i = 0; i<3; i++) {
		int t = 0;
		System.out.println("Internal calculator is equal to " );
		System.out.println(i);
		System.out.println(" External calculator is equal to ");
		while (t < 100) {
			if (t == 10) break;
			System.out.print(t + " ");
			t++;
		}}}}
		
		
		
	

