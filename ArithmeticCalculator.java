package project.Com;

import java.util.Scanner;


public class ArithmeticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=0;
		int number2=0;
		int result=0;
		byte choice=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Arithmetic Calculator");
		System.out.println("Press 1 to add");
		System.out.println("Press 2 to substract");
		System.out.println("Press 3 to devide");
		System.out.println("Press 4 to multiply");
		System.out.println("Press 5 for Modulo");
		choice = sc.nextByte();
		System.out.println("Enter the First Value");
		number1 = sc.nextInt();
		System.out.println("Enter the Second Value");
		number2 = sc.nextInt();
		if (choice ==1)
		{
			result = number1 +number2;
			System.out.println("The sum is:"+result);

		}
		else if (choice==2)

		{
			result = number1 - number2;	
			System.out.println("The difference is:"+result);

		}
		else if (choice ==3)
		{
			result = number1 * number2;	
			System.out.println("The multiplication is:"+result);

		}
		else if (choice ==4)
		{
			result = number1 / number2;	
			System.out.println("The quotient is:"+result);

		}
		else if ( choice ==5)
		{
			result = number1 % number2;	
			System.out.println("The modulo is:"+result);

		}
		else
			System.out.println("Sorry Invalid Choice");

	}

}
