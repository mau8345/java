package j2;
class Pwr{
	double b;
	int e;
	double val;
Pwr (double base, int exp){
	this.b = base;
	this.e = exp;
	this.val = 1;
	for (; exp > 0; exp --) this.val = this.val * base;
	if (exp == 0) return;
}
double get_pwr() {
//return val; or	
	return this.val;}
}
public class DemoThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pwr x = new Pwr (4.0, 2);
		Pwr y = new Pwr (2.5 , 1);
		Pwr z = new Pwr (5.7, 0);
		System.out.println(x.b + " � ������ " +x.e + " = "+ x.get_pwr());
		System.out.println(y.b + " � ������ " +y.e + " = "+ y.get_pwr());
		System.out.println(z.b + " � ������ " +z.e + " = "+ z.get_pwr());
	}

}
