package aula97.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import aula97.entities.Funcionario;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.println("Quantos funcionários serão cadastrados?");
		int N = entrada.nextInt();
		
		for (int i=0; i<N; i++) {
			
			System.out.println();
			System.out.println("Funcionario #" + (i +1 ) + ":");
			
			System.out.print("Id: ");
			Integer id = entrada.nextInt();
			while (hasId(list, id)) {
				System.out.print("ID cadastrado, tente novamente: ");
				id = entrada.nextInt();
			}
			
			
			System.out.print("Nome: ");
			entrada.nextLine();
			String nome = entrada.nextLine();
			System.out.println("Salário: ");
			Double salario = entrada.nextDouble();
			
			Funcionario func = new Funcionario(id, nome, salario);
			
			list.add(func);
		}
		
		System.out.print("Qual o ID do funcionário com aumento de salario: ");
		entrada.close();

	}

	private static boolean hasId(List<Funcionario> list, Integer id) {
			return false;
	}

}
