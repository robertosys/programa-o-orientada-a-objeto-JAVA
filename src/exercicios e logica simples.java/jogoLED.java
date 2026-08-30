import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class jogoLED {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Minha Aplicação");

        janela.setSize(600, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);

        // Cria o painel onde faremos os desenhos
        JPanel painel = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {

                super.paintComponent(g);

                // Primeiro círculo - vermelho
                g.setColor(Color.RED);
                g.fillOval(50, 30, 60, 60);

                // Segundo círculo - azul
                g.setColor(Color.BLUE);
                g.fillOval(150, 30, 60, 60);

                // Terceiro círculo - verde
                g.setColor(Color.GREEN);
                g.fillOval(250, 30, 60, 60);

                // Quarto círculo - amarelo
                g.setColor(Color.YELLOW);
                g.fillOval(350, 30, 60, 60);

                // Quinto círculo - laranja
                g.setColor(Color.ORANGE);
                g.fillOval(450, 30, 60, 60);


                // Define a cor dos números
                g.setColor(Color.BLACK);

                // Define uma fonte grande e em negrito
                g.setFont(new Font("Arial", Font.BOLD, 24));

                // Escreve os números abaixo dos círculos
                g.drawString("1", 72, 125);
                g.drawString("2", 172, 125);
                g.drawString("3", 272, 125);
                g.drawString("4", 372, 125);
                g.drawString("5", 472, 125);
            }
        };
        painel.setBackground(Color.WHITE);
        janela.add(painel);
        janela.setVisible(true);
    }
}