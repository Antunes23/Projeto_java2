package estrutura_condicional;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite o número do dia da semana (1-7): ");
		numero = ler.nextInt();
		if(numero == 1) {
			System.out.println("O dia da semana é Segunda-Feira");
		}
		else if(numero == 2) {
			System.out.println("O dia da semana é Terça-Feira");
		}
		else if(numero == 3) {
		System.out.println("O dia da semana é Quarta-Feira");
	}
		else if(numero == 4) {
			System.out.println("O dia da semana é Quinta-Feira");
		}
		else if(numero == 5) {
			System.out.println("O dia da semana é Sexta-Feira");
		}
		else if(numero == 6) {
			System.out.println("O dia da semana é Sábado");
		}
		else if(numero == 7) {
			System.out.println("O dia da semana é Domingo");
		}
		else
			System.out.println("Dia invalido");
		ler.close();
}}