package aplicacao;

import java.util.Scanner;

public class PrimeiraQuestao {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe seu peso!");
        float peso = scanner.nextFloat();

        System.out.println("Informe sua altura");
        float altura = scanner.nextFloat();

        float imc = peso / (altura*altura);

        System.out.println("Seu IMC é:" + imc);
       
        scanner.close();
	}
}
