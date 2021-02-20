package testecalendario;

import java.util.Scanner;


public class calendarioteste {
      
      
      public static void main(String[] args) {
        
        Scanner teclado =  new Scanner (System.in);
        double calendario;

        System.out.println ("Inicialize o número correspondente ao mês para obter informações sobre o mesmo: ");
        calendario = teclado.nextDouble();
        System.out.println (calendario == 1 ? "Janeiro 2021\n D S T Q Q S S\n 27 28 29 30 31 1 2\n 3 4 5 6 7 8 9\n 10 11 12 13 14 15 16\n 17 18 19 20 21 22 23\n 24 25 26 27 28 29 30\n 31 " : "Acesse o segundo mês: ");
        System.out.println ("Digite o número do segundo mês: ");
        calendario = teclado.nextDouble();
        System.out.println (calendario == 2 ? "Fevereiro 2021\n D S T Q Q S S\n 31 1 2 3 4 5 6\n 7 8 9 10 11 12 13\n 14 15 16 17 18 19 20\n 21 22 23 24 25 26 27\n 28 " : "Acesse o próximo mês: ");
        System.out.println ("Digite o número do terceiro mês: ");
        calendario = teclado.nextDouble();
        System.out.println (calendario == 3 ? "Março 2021\n D S T Q Q S S\n 28 1 2 3 4 5 6\n 7 8 9 10 11 12 13\n 14 15 16 17 18 19 20\n 21 22 23 24 25 26 27\n 28 29 30 31 " : "Acesse o próximo mês: ");
        System.out.println ("Digite o número do quarto mês: ");
        calendario = teclado.nextDouble();
        System.out.println (calendario == 4 ? "Abril 2021\n D S T Q Q S S\n 28 29 30 31 1 2 3\n 4 5 6 7 8 9 10\n 11 12 13 14 15 16 17\n 18 19 20 21 22 23 24\n 25 26 27 28 29 30" : "Acesse o próximo mês: ");
        System.out.println ("Digite o número do quinto mês: ");
        calendario = teclado.nextDouble();
        System.out.println (calendario == 5 ? "Maio 2021\n D S T Q Q S S\n 25 26 27 28 29 30 1\n 2 3 4 5 6 7 8\n 9 10 11 12 13 14 15\n 16 17 18 19 20 21 22\n 23 24 25 26 27 28 29\n 30 31 " : "Acesse o próximo mês: ");
        System.out.println ("Digite o número do sexto mês: ");
        calendario = teclado.nextDouble();
        System.out.println (calendario == 6 ? "Junho 2021\n D S T Q Q S S\n 30 31 1 2 3 4 5\n 6 7 8 9 10 11 12\n 13 14 15 16 17 18 19\n 20 21 22 23 24 25 26\n 27 28 29 30" : "Acesse o próximo mês: ");
        System.out.println ("Digite o número do sétimo mês: ");
        calendario = teclado.nextDouble();
        System.out.println (calendario == 7 ? "Julho 2021\n D S T Q Q S S\n 27 28 29 30 1 2 3\n 4 5 6 7 8 9 10\n 11 12 13 14 15 16 17\n 18 19 20 21 22 23 24\n 25 26 27 28 29 30 31" : "Acesse o próximo mês: ");
        System.out.println ("Digite o número do oitavo mês: ");
        calendario = teclado.nextDouble();
        System.out.println (calendario == 8 ? "Agosto 2021\n D S T Q Q S S\n 1 2 3 4 5 6 7\n 8 9 10 11 12 13 14\n 15 16 17 18 19 20 21\n 22 23 24 25 26 27 28\n 29 30 31" : "Acesse o próximo mês: ");
        System.out.println ("Digite o número do nono mês: ");
        calendario = teclado.nextDouble();
        System.out.println (calendario == 9 ? "Setembro 2021\n D S T Q Q S S\n 29 30 31 1 2 3 4\n 5 6 7 8 9 10 11\n 12 13 14 15 16 17 18\n 19 20 21 22 23 24 25\n 26 27 28 29 30" : "Acesse o próximo mês: ");
        System.out.println ("Digite o número do décimo mês: ");
        calendario = teclado.nextDouble();
        System.out.println (calendario == 10 ? "Outubro 2021\n D S T Q Q S S\n 26 27 28 29 30 1 2\n 3 4 5 6 7 8 9\n 10 11 12 13 14 15 16\n 17 18 19 20 21 22 23\n 24 25 26 27 28 29 30\n 31" : "Acesse o próximo mês: ");
        System.out.println ("Digite o número do décimo primeiro mês: ");
        calendario = teclado.nextDouble();
        System.out.println (calendario == 11 ? "Novembro 2021\n D S T Q Q S S\n 31 1 2 3 4 5 6\n 7 8 9 10 11 12 13\n 14 15 16 17 18 19 20\n 21 22 23 24 25 26 27\n 28 29 30" : "Acesse o proximo mês: ");
        System.out.println ("Digite o número do décimo segundo mês: ");
        calendario = teclado.nextDouble();
        System.out.println (calendario == 12 ? "Dezembro 2021\n D S T Q Q S S\n 28 29 30 1 2 3 4\n 5 6 7 8 9 10 11\n 12 13 14 15 16 17 18\n 19 20 21 22 23 24 25\n 26 27 28 29 30 31" : "Acesse o próximo mês: ");
        teclado.close();




      }
      
    
}
