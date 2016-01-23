package j2;
class FDemo{
	int x;
	FDemo (int i) {
		x = i;
	}
//called when object is necessary to delete
	protected void finalize(){ //this method is protected and reserved;
		System.out.println("finalization of " + x);
	}
	//generate object that will be deleted at the same time
	void generator (int i){
		FDemo o = new FDemo(i);
	}
}

public class Finalize {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		FDemo ob = new FDemo(0);
		for (count = 1; count < 100000; count ++){
				ob.generator(count);//we give command to new object ob to use method generator
				// also 'count' is equal to i from "generator"
		}
	}

}
