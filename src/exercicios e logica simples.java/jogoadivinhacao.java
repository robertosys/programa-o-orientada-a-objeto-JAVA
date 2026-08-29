/* Código para jogo de advinhação de 1 a 100 com tentativas infinitas ate acertar o numero
com feedback de acertos e erro.  */


import java.util.Random;
import java.util.Scanner;
public class jogoadivinhacao {

     
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random sorteio = new Random();
        int numerosorteado = sorteio.nextInt(100) + 1;
        int numero1= 0;
        int contador = 0;
        while(numero1 !=numerosorteado){
            contador ++;
        System.out.println("Digite um número de 1 a 100");
        numero1 = entrada.nextInt();
         if(numero1 > numerosorteado){
            System.out.println("Muito alto!!");
         }else if(numero1< numerosorteado){
            System.out.println("Muito baixo!!");
        }
        if(numero1 == numerosorteado){
            System.out.println("Parabéns você acertou o número sorteado!!");
            System.out.println("numero de vezes que tentou:"+contador);
            if(contador <= 5){
                System.out.println("Você é um ótimo jogador!!");
        }else if(contador >50){
            System.out.println("Você é um péssimo jogador!!");
        }else if(contador >6 && contador <49){
            System.out.println("Você é um jogador mediano!!");
        }
        }
        


    }
    entrada.close();
}
}