package estruturaCondicional;

import java.util.Scanner;

public class Exer003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero.");
		int A = sc.nextInt();
		
		System.out.println("Digite o segundo n�mero");
		int B = sc.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}

		sc.close();
	}
}
