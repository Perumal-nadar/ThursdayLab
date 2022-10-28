package Solutions;

import java.util.Scanner;

public class Question_no_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the principal amount:");
		double p = scan.nextInt();// p stands for principal amount
		System.out.println("Enter the rate of percentage:");
		double r = scan.nextInt();// r Stands for interest rate
		System.out.println("Enter year:");
		double t = scan.nextInt(); // t stands for time
		double SI = (p*r*t)/100; 
		System.out.println("Simple interest:"+SI);// SI stands for simple interest

	}

}
