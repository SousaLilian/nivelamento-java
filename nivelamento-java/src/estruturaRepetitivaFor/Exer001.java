package estruturaRepetitivaFor;

import java.util.Scanner;

public class Exer001 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite n?mero inteiro:");
				
		int x = sc.nextInt();
		
		for (int i=1; i<=x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
		
		System.out.println();
		System.out.println("Esses s?o os n?meros ?mpares do n?mero digitado");
	}
}
