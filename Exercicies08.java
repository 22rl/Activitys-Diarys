package aulabasico01;

import java.util.Scanner;
public class Exercicies08 {

	public static void main(String[] args) {
		Scanner imput = new Scanner (System.in);
		
		System.out.println ("Digite o primeiro valor ");
		int valor1 = imput.nextInt();
		
		System.out.println ("Digite o segundo valor ");
		int valor2 = imput.nextInt();
		
		System.out.println ("Digite o terceiro valor");
		int valor3 = imput.nextInt();
		
		if (valor1 < valor2 && valor1 < valor3) {
			System.out.println ("Voce deve comprar o produto que corresponde ao primeiro valor");
		} else if (valor2 < valor1 && valor2 < valor3) {
			System.out.println ("Voce deve comprar o produto que corresponde ao segundo valor");
		} else if (valor3 < valor1 && valor3 < valor2) {
			System.out.println ("Voce deve comprar o produto que corresponde ao terceiro valor");
		} else {
			System.out.print("Nada consta");
		}
	}

}
