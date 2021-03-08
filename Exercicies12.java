package aulabasico01;

import java.util.Scanner;

public class Exercicies12 {

	public static void main(String[] args) {
		Scanner imput = new Scanner (System.in);
		
		System.out.println ("As perguntas a seguir servirão para analisar o caso: ");
		
		System.out.println ("Telefonou para a vítima? ");
		String telefone = imput.next();
		System.out.println ("Esteve no local do crime? ");
		String local = imput.next();
		System.out.println ("Mora perto da vítima? ");
		String morar = imput.next();
		System.out.println ("Devia para a vítima? ");
		String divida = imput.next();
		System.out.println ("Trabalhou com a vítima? ");
		String trabalho = imput.next();
		
		int contador = 0;
		
		if (telefone.equalsIgnoreCase("Sim")) {
			contador++;
		}
		if (local.equalsIgnoreCase("Sim")) {
			contador++;
		}
		if (morar.equalsIgnoreCase("Sim")) {
			contador++;
		}
		if (divida.equalsIgnoreCase("Sim")) {
			contador++;
		}
		if (trabalho.equalsIgnoreCase("Sim")) {
			contador++;
		}
		
		if (contador == 2) {
			System.out.println ("Suspeita");
		} else if (contador == 3 || contador == 4) {
			System.out.println ("Cúmplice");
		} else if (contador == 5) {
			System.out.println ("Assassino");
		} else if (contador == 0){
			System.out.println ("Inocente...");
		}
		imput.close();

	}

}
