/*código de simulação de caixa eletronico trabalhando lógica basica. */

import java.util.Scanner;
public class caixaeletronico {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        double saldo = 1000;
        int menu = 0;
        double deposito = 0;
        double saque = 0;
        while(menu != 4){
            System.out.println("Menu:");
            System.out.println("1.Consultar saldo.");
            System.out.println("2.Depositar valor.");
            System.out.println("3.sacar valor.");
            System.out.println("4.Sair.");
            menu = entrada.nextInt();
            if(menu ==1){
                System.out.println(saldo);

            }
            else if(menu == 2 ){
                System.out.println("digite o valor do deposito:");
                deposito = entrada.nextDouble();
                if(deposito > 0){
                saldo = deposito+saldo;
                }else{
                    System.out.println("erro impossivel digitar valor 0 ou negativo.");
                }

            }

           else if(menu == 3){
            System.out.println("digite o valor do saque:");
            saque = entrada.nextDouble();
            if(saque<=saldo){
            saldo = saldo - saque;
            }else{
                System.out.println("saldo insuficiente.");
            }

           }
           else if (menu != 4 && menu != 1 && menu != 2 && menu !=3 ){
            System.out.println("nenhuma opção possivel digitada, tente novamente.");
           }

    } if(menu ==4){
        System.out.println("obrigado por usar esse caixa eletronico!!");
    }
    entrada.close();
}
}