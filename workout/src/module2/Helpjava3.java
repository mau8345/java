package module2;

public class Helpjava3 {	
		
	void showmenu(){
				System.out.println("Help");
				System.out.println(" 1. If");
				System.out.println(" 2. For");
				System.out.println(" 3. While");
				System.out.println(" 4. Switch");
				System.out.println(" 5. Do-while");
				System.out.println("Choose: ");
		}
				
		boolean intid(int ch){
			if(ch < '1' | ch > '5' & ch != 'q') return false;
			else return true;}
		/*choice = (char) System.in.read();
				do
				{ignore = (char) System.in.read();
				}while (ignore != '\n');
				}while (choice < '1' | choice > '5');}*/
			
		
		void helpon(int what){	
			switch (what){
			case '1':
				System.out.println(" 1. If operator");
				break;
			case '2':
				System.out.println(" 2. For operator");
				break;
			case '3':
				System.out.println(" 3. While operator");
				break;
			case '4':
				System.out.println(" 4. Switch operator");
				break;
			case '5':
				System.out.println(" 5. Do-while operator");
				break;
	} System.out.println();
		}}
		
		class Initiate{
		public static void main(String args[])
				throws java.io.IOException{
		char choise, ignore;
		Helpjava3 help = new Helpjava3();
		for (;;) {
			do{help.showmenu(); choise = (char) System.in.read();
				do{	ignore = (char) System.in.read();}
				while (ignore != '\n');
				} while (!help.intid(choise) );
			if (choise == 'q') break;
			System.out.println("\n");
			help.helpon(choise);
				}	
			}
		}
