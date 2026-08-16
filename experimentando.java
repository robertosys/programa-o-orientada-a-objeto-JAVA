import java.util.Scanner;
import java.util.ArrayList;

public class experimentando {
    public static void main(String[] args) {
      double nome = 120.20310243;
      System.out.println(nome);
      ArrayList<String> nomes = new ArrayList<String>();
      ArrayList<Double> numeros = new ArrayList<Double>();
      nomes.add("João");
      nomes.add("robertão");
      nomes.add("joão e maria");
      numeros.add(1.0);
      numeros.add(2.0);     
      System.out.println(nomes.get(0));
      System.out.println(numeros.get(1));
      System.out.println(nomes.get(1));
      System.out.println(numeros.get(0)+numeros.get(1));
      Scanner entrada = new Scanner(System.in);
      nomes.set(0, entrada.nextLine());
      System.out.println(nomes.get(0));

    }
}