package JavaPractisePrograms;

import java.util.Scanner;

public class pascalsTriangle {
public static int ncr(int n,int r) {
	return fact(n)/(fact(n-r)*fact(r));
}
public static int fact(int n) {
	int x = 0;
	if(n==0)
		x= 1;
	else if(n==1)
		x= 1;
	else if(n>1)
		x= n*(fact(n-1));
	return x;
}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0;i<num;i++)
		{
			for(int k=num;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
				System.out.print(" "+ncr(i,j));
				System.out.println();
		}
	}
}


