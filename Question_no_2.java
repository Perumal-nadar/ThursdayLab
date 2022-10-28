package Solutions;

import java.util.Scanner;

public class Question_no_2 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		float pi = 3.14f;
		System.out.println("Enter radius of a circle:");
		int r = scan.nextInt();
		float x = pi*r*r;
		float y = 2*pi*r;
		System.out.println("Area of the circle:"+x);
		System.out.println("Circumference of the circle:"+y);

	}

}
