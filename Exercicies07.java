package aulabasico01;

import java.util.Scanner;
public class Exercicies07 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println ("Digite o primeiro numero ");
		int num1 = teclado.nextInt();
		
		System.out.println ("Digite o segundo numero ");
		int num2 = teclado.nextInt();
		
		System.out.println ("Digite o terceiro numero ");
		int num3 = teclado.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println ("O primeiro numero digitado representa o maior numero entre os 3 digitados");
		} else if (num2 > num1 && num2 > num3) {
				System.out.println ("O segundo numero representa o maior numero entre os 3 digitados");
		} else if (num3 > num1 && num3 > num2) {
				System.out.println ("O terceiro numero representa o maior numero entre os 3 digitados");
		} else {
				System.out.println ("Nada consta");
		}
		System.out.println ("Analisando seus dados, vamos informar qual numero sera o menor entre os 3 digitados");
		
		if (num1 < num2 && num1 < num3) {
			System.out.println ("O primeiro numero digitado sera considerado o menor entre os 3 digitados");
		} else if (num2 < num1 && num2 < num3) {
			System.out.println ("O segundo numero digitado sera considerado o menor entrre os 3 digitados");
		} else if (num3 < num1 && num3 < num2) {
			System.out.println ("O terceiro numero digitado sera considerado o menor entre os 3 digitados");
		} else {
			System.out.println ("Nada consta");
		}
		teclado.close();        
		}
}
