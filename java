import java.util.Scanner;
public class E13_SwappingVar {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// User input
		System.out.println("Please enter a value for variable a: ");
		int a = input.nextInt();
		System.out.println("Please enter a value for variable b: ");
		int b = input.nextInt();
		input.close();
		
		//Print out pre-swap values
		System.out.println("The pre swap value for variable a is: "+a+", and the pre swap value for variable b is: "+b+".");
		
		//The Swapping mechanism
		int temp1 = a;
		a = b;
		b = temp1;
		
		//Print out post-swap values
		System.out.println("The post swap value for variable a is: "+a+", and the post swap value for variable b is: "+b+".");
		
		
	}
		
}
