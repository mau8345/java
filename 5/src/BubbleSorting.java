
public class BubbleSorting {
	//demo of bubble sorting algorithm
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums [] = {99, -10, 100123, 18, -978, 5623, 463, - 9, 287, 49};
		int a, b, t;
		int size;
		size = 10; // quantity of sorting elements
		
		//This is bubble sort
		System.out.println("array: "  );
		for (int i = 0; i < size; i++) System.out.println(" " + nums [i]);
		//realization of bubble sorting algorithm
		for (a = 1; a < size; a ++)
			for (b = size - 1; b >=a; b --){
				if (nums [b-1] > nums[b]) {
					//if out of order = exchange the elements
				t = nums[b-1];
				nums[b - 1] = nums [b];
				nums[b] = t;
				}
			}
		//display the sorted arrays;
		System.out.println("Sorted array is: ");
		for (int i = 0; i < size; i ++) System.out.println(" " + nums[i]);
		System.out.println();
		
	}

}
