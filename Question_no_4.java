package Solutions;

import java.util.Scanner;

public class Question_no_4 {

	public static void main(String[] args) {
		//Arithmetic_demo();
		//Assignment_demo();
		//Logical_demo();
		//Relational_demo();
		Bitwise_demo();
// Uncomment the classes to run when needed........
	}
// Arithmetic operators	
	public static void Arithmetic_demo() {
		Scanner get = new Scanner(System.in);
		System.out.println("Enter the First number:");
		int num1 = get.nextInt();
		System.out.println("Enter the Second number:");
		int num2 = get.nextInt();
		System.out.println("Adition:"+(num1 + num2));
		System.out.println("Subtraction:"+(num1 - num2));
		System.out.println("Multiplication:"+(num1 * num2));
		System.out.println("Division:"+(num1 / num2));
		System.out.println("Modulo:"+(num1 % num2));
		
	}
// Assignment operators
	public static void Assignment_demo() {
		int x = 10;
		
		System.out.println(x += 4);// x += y : x = x + y
		System.out.println(x -= 6);// x -= y : x = x - y
		System.out.println(x *= 8);// x *= y : x = x * y
		System.out.println(x /= 10);// x /= y : x = x / y
	}
// Logical operators
	public static void Logical_demo() {
		boolean x = true;
		boolean y = false;
		System.out.println("&& operator:"+(x && y));// && = AND operator
		System.out.println("|| operator:"+(x || y));// || = OR operator
		System.out.println("! operator:"+(!y));// ! = NOT operator;
	}
// Relational operator
	public static void Relational_demo() {
		int a = 10 , b = 20;
		System.out.println("The result of a>b is:"+(a>b));
		System.out.println("The result of a<b is:"+(a<b));
		System.out.println("The result of a>=b is:"+(a>=b));
		System.out.println("The result of a<=b is:"+(a<=b));
		System.out.println("The result of a==b is:"+(a==b));
	}
// Bitwise operator
	public static void Bitwise_demo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first value:");
		int num1 = scan.nextInt();  
		System.out.println("Enter the Second value:");
		int num2 = scan.nextInt();
		System.out.println("The result of [num1 & num2] is:"+(num1 & num2));
		System.out.println("The result of [num1 | num2] is:"+(num1 | num2));
		System.out.println("The result of [num1 ^ num2] is:"+(num1 ^ num2));
	}
}
