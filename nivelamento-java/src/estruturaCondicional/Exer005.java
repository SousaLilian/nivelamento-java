package estruturaCondicional;

import java.util.Scanner;

public class Exer005 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cachorro Quente - c?digo 1 - R$4,00");
		System.out.println("X-Salada - c?digo 2 - R$4,50");
		System.out.println("X-Bacon - c?digo 3 - R$5,00");
		System.out.println("Torrada simples - c?digo 4 - R$2,00");
		System.out.println("Refrigerante - c?digo 5 - R$1,50");
		
		System.out.println();
		System.out.println("Entre com o c?digo de 1 ao 4");
		int codigo = sc.nextInt();
		
		System.out.println("Qual a quantidade?");
		int quantidade = sc.nextInt();
		
		double total;
		if (codigo == 1) {
			total = quantidade * 4.0;
		}
		else if (codigo == 2) {
			total = quantidade * 4.5;
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		}
		else {
			total = quantidade * 1.5;
		}

		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}
}
