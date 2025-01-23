package Arrays.Projeto01;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Calculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Digite o nome do Aluno: ");
        String nome = scan.next();

        System.out.println("Digite a quantidade de notas: ");
        int quantidade = scan.nextInt();

        float[] notas = new float[quantidade];

        for(int i =0; i<quantidade; i++){
            System.out.println("Digite a "+(i+1)+"ª nota :");
            notas[i] = scan.nextFloat();
        }

        float soma = 0;
        for(float nota : notas){
            soma += nota;
        }

        float media = soma/quantidade;

        System.out.println("A média do aluno "+nome+" é: " + df.format(media));

        if(media>7){
            System.out.println("Foi Aprovado");
        }else if(media<=6.9 & media>=5){
            System.out.println("Está de Recuperação");
        }else{
            System.out.println("Foi Reprovado");
        }

        scan.close();

    }
}
