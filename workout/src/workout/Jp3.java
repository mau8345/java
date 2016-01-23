package workout;

public class Jp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num, sroot, rerr;
		for (num = 1; num < 100; num ++){
			sroot = Math.sqrt(num);
			System.out.println(sroot);
			rerr = num - (sroot * sroot);
			System.out.println("error is " + rerr);
		}

	}

}
