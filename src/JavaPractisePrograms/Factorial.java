package JavaPractisePrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter a small digit to give its factorial, this program uses int , so pls give a small number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		System.out.println("ITS FACTORIAL IS "+factorial(num));

	}
		public static int factorial(int num)
		{ int x = 0;
			if(num>1)
			x= x+num*factorial(num-1);
			else if(num==1)
				x= 1;
			else if(num==0)
				x= 1;
			return x;
		}
		
}
