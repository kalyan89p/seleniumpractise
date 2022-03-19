package JavaPractisePrograms;

import java.util.Scanner;

public class armstrongNumber {

	public static void main(String[] args) {

		System.out.println("Enter a small digit to find if its an ARMSTRONG NUMER, this program uses int , so pls give a small number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arm = num;
		int j=num;
		int digits = 0;
		int k=0;
		while(num>0) {
			digits=digits+1;
			num=num/10;
			
		}
		System.out.println(digits);
		while(arm>0) {
			k=k+power(arm%10,digits);
			arm=arm/10;
			System.out.println(k);
		}
		if(k==j)
		{System.out.println("Yes its an ARMSTRONG NUMBER");
		}
		else 
			System.out.println("No its not an ARMSTRONG NUMBER");
	}
	
	public static int power(int x, int y) 
	{ int result = x; 
	for (int i = 1; i < y; i++) 
	{ result = result * x; } 
	return result; 
	}

	
}
