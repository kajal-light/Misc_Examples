package Araay;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Palidrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 0;
		int temp = 0;
		int rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
		try {
			int originalInput = sc.nextInt();
			input = originalInput;
			while (input != 0) {
				System.out.println("input" + input);
				temp = input % 10;
				System.out.println(temp);

				rev = rev * 10 + temp;

				input /= 10; // input = input/10;
				System.out.println(input);
//		input=(input-temp)/10;
			}
			System.out.println("final rev:" + rev);
			if (originalInput == rev) {

				System.out.println("the number is palidrome");
			} else
				System.out.println("no");

		} catch (InputMismatchException e) {
	
			System.out.println("You entered non numeric input");
		}finally {
			System.out.println("finally blocked");
		}
	}
}
