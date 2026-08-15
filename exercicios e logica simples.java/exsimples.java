import java.util.Scanner;

public class exsimples {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;

        System.out.println("digite sua idade:\n");
        idade = entrada.nextInt();

        if (idade >= 18) {
            System.out.println("voce é maior de idade");
        } else {
            System.out.println("sinto muito, voce é menor de idade");
        }

        entrada.close();
    }
}