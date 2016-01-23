package workout;

public class NewBreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i<4; i++){
			one: {
				two: {
					three: {
					System.out.println("i is equal to " + i);
					if (i==1) break one;
						if (i==2) break two;
							if (i==3) break three;
				System.out.println("It shall never be done");
						}System.out.println("After block 3");
					}System.out.println("After block 2");
			}System.out.println("After block 1");
		}System.out.println("After cycle for");
	}

}
