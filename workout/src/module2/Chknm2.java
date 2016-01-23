package module2;


class Chknum {
	boolean isEven(int x){
		if ((x%2)==0) return true;
		else return false;
	}
	
}
class Demo{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Chknum e = new Chknum();
if (e.isEven(10)) System.out.println("10");
if (e.isEven(9)) System.out.println("9");
if (e.isEven(8)) System.out.println("8");
Factor x = new Factor();
if (x.isFactor (20, 2)) System.out.println("2");
if (x.isFactor (20, 3)) System.out.println("3");
	}
}

class Factor {
	boolean isFactor(int a, int b){
		if ((a % b)== 0) return true;
		else return false;
	}
	
}