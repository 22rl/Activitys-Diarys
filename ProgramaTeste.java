package Estudo01;

import java.util.Scanner;
public class ProgramaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		System.out.println ("Digite o valor da temperatura em Celsius: ");
		int celsius = teclado.nextInt();
		
		double rankine = (celsius * 1.8000) + 491.67;
		double kelvin = (celsius + 273.15);
		double reaumur = celsius / 0.80000;
		int fahrenheit = celsius * 9 / 5 + 32;
		
		System.out.println (String.format("O valor da convers�o de %s Celsius para Fahrenheit � %s", celsius, fahrenheit));
		System.out.println (String.format("O valor da convers�o de %s Celsius para Kelvin � %s", celsius, kelvin));
		System.out.println (String.format("O valor da convers�o de %s Celsius para R�amur � %s", celsius, reaumur));
		System.out.println (String.format("O valor da convers�o de %s Celsius para Rankine � %s", celsius, rankine));
		
		teclado.close();
		
		

	}

}
