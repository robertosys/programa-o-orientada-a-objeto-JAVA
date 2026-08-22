import java.util.Scanner;
import javax.swing.JFrame; 
import javax.swing.JPanel; 
import java.awt.Graphics; 
import java.awt.Color;
import java.util.Random;
public class jogoLED {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int numerteste;
        int numero = aleatorio.nextInt(5) + 1; 
        JFrame janela = new JFrame("Jogo LED");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(1600, 800);
        janela.setLocationRelativeTo(null);
        janela.setLayout(null);
        JPanel painel = new JPanel() {
           
            @Override
             protected void paintComponent(Graphics g) { 
 
                super.paintComponent(g); 
 
                // Primeiro círculo - vermelho 
                g.setColor(Color.RED); 
                g.fillOval(550, 350, 60, 60); 
 
                // Segundo círculo - azul 
                g.setColor(Color.BLUE); 
                g.fillOval(650, 350, 60, 60); 
 
                // Terceiro círculo - verde 
                g.setColor(Color.GREEN); 
                g.fillOval(750, 350, 60, 60); 
 
                // Quarto círculo - amarelo 
                g.setColor(Color.YELLOW); 
                g.fillOval(850, 350, 60, 60); 
 
                // Quinto círculo - laranja 
                g.setColor(Color.ORANGE); 
                g.fillOval(950, 350, 60, 60); 
            }




        };
        painel.setBackground(Color.BLACK);
        janela.add(painel);
        janela.setVisible(true);



   }
}