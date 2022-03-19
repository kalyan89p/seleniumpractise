package JavaPractisePrograms;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
System.out.println("Enter a number to find if it is primer or not");
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int flag=1;
int i;
for(i=2;i<x/2;i++) {
	if(x%i==0) {
		flag=0;
 break;}
	}
if(flag==1) System.out.println("ITS  A PRIME NUMBER");
else System.out.println("ITS NOT A PRIME NUMBER, ITS DIVISIBLE BY "+i);
}

}

