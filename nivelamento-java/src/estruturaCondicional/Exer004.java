package estruturaCondicional;

import java.util.Scanner;

public class Exer004 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a hora inicial:");
		int horaInicial = sc.nextInt();
		System.out.println("Digite a hora final");
		int horaFinal = sc.nextInt();

		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}

		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		sc.close();
	}
}
