package JavaPractisePrograms;

import java.util.Random;
import java.util.Scanner;

public class randomNumber {

	public static void main(String[] args) {
		System.out.println("Next Random number should be between 0 and ? ");
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		Random r = new Random();
		System.out.println("Rolling Drums sound.... and....\n"+r.nextInt(x));
		
		
			
	}

}
