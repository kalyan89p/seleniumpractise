package JavaPractisePrograms;

import java.util.Scanner;

public class primeNumberTriangle {
	public static int iskprime(int k) {
		int z=1;
		for ( int i=2;i<k/2;) {
			if(k%i==0) {
				z=0; break;
		}
			else 
				i++;}
		return z;
	}

	public static void main(String[] args) {
		System.out.println("How many levels of Primer Number Triangle do you want?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int j=1;j<=num;j++) {
			for(int i=num;i>0;i--)
			System.out.print(" ");
			
			for(int k=j;k<num;k++) {
			int kisprime=iskprime(k);
				if(kisprime == 1)
					System.out.print(" "+k);
			}
			System.out.println();
		}
	}

}
