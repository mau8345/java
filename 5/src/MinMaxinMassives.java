
public class MinMaxinMassives {
//min and max in arrays
	public static void main (String args[]){
		int num[] = new int[3];
		int min, max;
		//than we give some value to the variables;
		num[0] = 99;
		num[1] = - 10;
		num[2] = 30;
		min = max = num[0];
		for (int i = 1; i < 3; i ++){
			if (num [i] < min) min = num[i];
			if (num[i] > max) max = num[i];
		}
		System.out.println("min and max " + min + " & " + max);
		
	}
}
