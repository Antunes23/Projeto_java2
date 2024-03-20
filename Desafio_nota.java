package estrutura_condicional;

import java.util.Scanner;

public class Desafio_nota {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int numero,a,b,c,d,media,soma;
		
		System.out.println("Olá caro estudante aqui irei calcular sua média, abaixo informe suas notas!");
		
		System.out.println("Informe a primeira nota: ");
		a = ler.nextInt();
		
		System.out.println("Informe a segunda nota: ");
		b = ler.nextInt();
		
		System.out.println("Informe a terceira nota: ");
		c = ler.nextInt();
		
		System.out.println("Informe a quarta nota: ");
		d = ler.nextInt();
		
		soma = a + b + c + d;
		media = soma / 4;
		if (media >= 6) {
		System.out.println("Parabéns! Você está aprovado! Com a média: " + media);
	
		}
		
		else {
		System.out.println("Sinto muito mas você está reprovado! Com a média: " + media);
		
		}
	}}
