package JavaPractisePrograms;

import java.util.Scanner;

public class fibonacciseries {


	public static void main(String[] args) {
		System.out.println("This program prints 0 and 1 as first two digits of Fibonacci series. Enter How many more numbers do you want in this series");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i=0;
		int j=1;
		int k;
		System.out.println(i+"\n"+j+"\n");
		
		while(num>0) {
			k=j+i;
			System.out.println(k);
			i=j;j=k;			
			num--;
			
		}
	}

}
