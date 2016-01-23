package workout;

public class HW2 {

	public static void main(String[] args)
	throws java.io.IOException {
		char ch, ignore;
		int count;
		count = 0;
		cycle:
		for ( ; ; ) {
		System.out.println("Please input any character. When '.' - progam will exit ");
		ch = (char) System.in.read();
		System.out.println("You have inputed char  " + ch);
		do
		{ignore = (char) System.in.read();
		}while (ignore != '\n');
			
		if (ch == ' ') count++;
		System.out.println("Quantity of _ is " + count);
		if (ch == '.') break cycle;
		}System.out.println("You have inputed right character");
		}
		// TODO Auto-generated method stub
		
	}

