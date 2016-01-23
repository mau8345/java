package workout;

public class Guess4 {
public static void main (String args[])
throws java.io.IOException
	{char ch, ignore, answer = 's';
	do{
		System.out.println("Gues character");
		ch = (char) System.in.read();	
			do{ignore = (char) System.in.read();}
			while (ignore != '\n');
			if (ch == answer) System.out.print("Right");
			else {
				if (ch < answer) System.out.println ("Closer to the end of the alphabet");
				else System.out.println("Answer is closer to the beggining of the alphabet");
			}
			}while (answer != ch);
			
		}
	}

