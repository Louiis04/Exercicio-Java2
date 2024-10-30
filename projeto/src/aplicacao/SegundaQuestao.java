package aplicacao;

import java.util.Scanner;

public class SegundaQuestao {
	public static void main (String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Digite 1 para Homem e 2 para Mulher");
    int gênero = scanner.nextInt();
    
    System.out.print("Digite sua idade");
    int idade = scanner.nextInt();

    System.out.print("Digite seu peso");
    float peso= scanner.nextFloat();
    
    double metabolismobasal = 0.0;

    if (gênero == 1){
        if(idade>=18 && idade<30){
            metabolismobasal = 15.057 * peso + 679;
        }
        else if(idade>30 && idade<60){
            metabolismobasal = 11.6 * peso + 879;
        }
        else if(idade>=60){
            metabolismobasal= 13.5 * peso + 487;
        }
    }
    if (gênero == 2){
        if(idade>=18 && idade<30){
            metabolismobasal = 14.7 * peso + 486.6;
        }
        else if(idade>30 && idade<60){
            metabolismobasal = 8.7 * peso + 829;
        }
        else if(idade>=60){
            metabolismobasal= 10.5 * peso + 596;
        }
    }
    System.out.println("Seu metabolismo basal e de:" + metabolismobasal + "Kcal");
    scanner.close();
}
}
