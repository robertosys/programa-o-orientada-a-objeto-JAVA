import java.util.Scanner;

public class Validacpf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu CPF sem espaço e apenas com numeros:");
        String CPF = entrada.nextLine();
        int resultado = 0;
        int mult = 11;
        int verificador = 0;
        int resultado2 = 0;

        int[] CPFnum = new int[11];
        for (int i = 0; i < CPF.length(); i++) {
            CPFnum[i] = CPF.charAt(i) - '0';
        }
        for(int x = 0; x<9;x++) {

            mult--;
            resultado = resultado + CPFnum[x] * mult;


        }
        resultado = resultado %11;
        resultado  = 11 - resultado;
        if(resultado == 10 || resultado == 11){
            if(CPFnum[9] == 0){
            verificador ++;
            }
        } else if (CPFnum[9] == resultado){
            verificador++;
        }


        mult = 11;
        for(int x = 0; x<10;x++) {

            resultado2 = resultado2 + CPFnum[x] * mult;
            mult--;


        }
        resultado2 = resultado2 %11;
        resultado2  = 11 - resultado2;
        if(resultado2 == 10 || resultado2 == 11){
            if(CPFnum[10] == 0){
                verificador ++;
            }
        }else if(CPFnum[10] == resultado2){
            verificador ++;
        }
        if(verificador == 2){
            System.out.println("CPF valido.");
        }else{
            System.out.println("Cpf invalido");
        }








    }
}