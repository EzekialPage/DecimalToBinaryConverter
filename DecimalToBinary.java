import java.util.Stack;
import java.util.Scanner;

//Ezekial Page
//CS2 program 1

public class Prg1{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a decimal number or exit to exit: ");
		String n = scan.nextLine();
		
		while(!n.equalsIgnoreCase("exit")){
			if(n.matches("^[0-9]+$")) {
				int x = Integer.parseInt(n);
					if(x == 0){
						System.out.println(x + " in binary is: " + 0);
						System.out.print("Enter a new decimal number or exit to exit: ");
						n = scan.nextLine();
					}else if(x > 1023){
						System.out.println("Error! number too large.");
						System.out.print("Enter a new decimal number or exit to exit: ");
						n = scan.nextLine();

					}else{
						System.out.println(x + " in binary is: " + toBinary(x));
						System.out.print("Enter a new decimal number or exit to exit: ");
						n = scan.nextLine();
					}
			}else{
				System.out.println("Error invalid input!");
				System.out.print("Enter a decimal number or exit to exit: ");
				n = scan.nextLine();
			}//end character check
		}//stop thing
	}// end main
	
	
	
	public static int toBinary(int n){
		String output = "";
		Stack s = new Stack();
		while(n > 0){
			int bit = n % 2;
			s.push(bit);
			if(s.size() > 99){
				return -1;
			}
			n = n / 2;
		}
		while(!s.isEmpty()){
			output += s.pop();
		}
		return Integer.parseInt(output);
	}//end toBinary
	
	public static boolean checkStr(String s) {
		boolean error = false;
		for(int i = 0; i < s.length(); i++) {
			for(int j = 0; j < 10; j++) {
				boolean num = false;
				if(s.charAt(i) == j) {
					num = true;
				}
				if(num == false) {
					error = true;
				}
			}
		}
		return error;
	}//end check
	
}//end class
