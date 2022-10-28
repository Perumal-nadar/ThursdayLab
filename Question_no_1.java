package Solutions;
import java.util.Scanner;

public class Question_no_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = scan.next();
		System.out.println("Enter the contact number:");
		int number = scan.nextInt();
		System.out.println("Enter the E-Mail ID:");
		String mail = scan.next();
		System.out.println("Enter your Gender:");
		String gender = scan.next();
		System.out.println("Enter your percentage:");
		float percentage = scan.nextFloat();
		
		System.out.println("Name:"+name);
		System.out.println("Contact number:"+number);
		System.out.println("Mail ID:"+mail);
		System.out.println("Gender"+gender);
		System.out.println("Percentage:"+percentage);

	}

}
