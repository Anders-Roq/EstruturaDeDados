package Arrays.Projeto01;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Calculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Digite a quantidade de notas: ");
        int quantidade = scan.nextInt();

        float[] notas = new float[quantidade];

        for(int i =0; i<quantidade; i++){
            System.out.println("Digite a nota "+(i+1)+" :");
            notas[i] = scan.nextFloat();

        }

        float soma = 0;
        for(float nota : notas){
            soma += nota;
        }

        float media = soma/quantidade;

        System.out.println("Média = " + df.format(media));

        if(media>7){
            System.out.println("Aprovado");
        }else if(media<=6.9 & media>=5){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }

        scan.close();

    }
}
