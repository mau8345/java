package workout;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e;
		int result;
		int f = 10;
		for (int i = 0; i < 10; i++, f--) {
			result = 1;
			e = i;
			while (e > 0) {
				result *= 2;
				e--;}
		System.out.println(" 2 в степени " + i + " = " + result + "(" + f);}}}
		