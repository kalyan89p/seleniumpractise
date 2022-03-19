package JavaPractisePrograms;

import java.util.Scanner;

public class palindromeNumber {

	public static void main(String[] args) {
		System.out.println("Enter a Number and see if its Palindrome or not");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int i=x; 
		int j=0;
		//int rev=x;
		while(i>0) {
			j=(j*10)+(i%10);
			i=i/10;
		}
		if(j==x) {
			System.out.println("Yes, its a palindrome");
		}
		else
			System.out.println("No its not a palindrome");

	}

}
