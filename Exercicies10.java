package aulabasico01;

import java.util.Scanner;
public class Exercicies10 {

	public static void main(String[] args) {
		Scanner imput = new Scanner (System.in);
		
			
		System.out.println ("Qual turno tu estuda? ");
		String turno = imput.next();
		
	    switch (turno) {
	    case "m":
	    case "M": System.out.println ("Bom dia, você estuda pela manhã"); break;
	    case "v":
	    case "V": System.out.println ("Boa tarde, você estuda pela tarde"); break;
	    case "n":
	    case "N": System.out.println ("Boa noite, você estuda pela noite"); break;
	    default: System.out.println ("Argumento inválido");
	    }
	    imput.close();

	}

}
