import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = input.nextLine();
		
		System.out.println("Enter age: ");
		byte age = input.nextByte();
		
		input.nextLine();
		
		System.out.println("Enter ENG: ");
		char sex = input.next().charAt(0);
		
		input.nextLine();
		System.out.println("Enter Word: ");
		String word = input.nextLine();
		
		double pi = Math.PI;
		
		
	}
}