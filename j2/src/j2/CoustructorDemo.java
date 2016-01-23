package j2;
//Its simple constructor
class MyClass {
	int x;
	MyClass (int i){//int i inputed
	//	x = 10;
		x = i;//constructor with parameters
		
	}
}
public class CoustructorDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generate new classes;
		//MyClass t1 = new MyClass ();
		MyClass t1 = new MyClass (10); //constructor with parameters;
		MyClass t2 = new MyClass (88);//constructor with parameters
		System.out.println (t1.x + " " + t2.x);//.x is necessary, because it will just print out class id;
	}

}
