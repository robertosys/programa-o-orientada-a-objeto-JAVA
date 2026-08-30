
/* ESSE CÓDIGO TEM A MESMA FUNÇÃO DO VALIDACPF PORÉM É APRESENTADO EM UM PAINEL COM CHATBOX AO INVES DE SER NO TERMINAL
*/
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class cpfpainel {

    public static void main(String[] args) {
        int resultado = 0;
        int mult = 11;
        int verificador = 0;
        int resultado2 = 0;

        // Cria a janela principal
        JFrame janela = new JFrame("Minha Aplicação");

        janela.setSize(1600, 900);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setLayout(null);

        // Cria um texto para aparecer na tela branca
        JLabel mensagem = new JLabel(
                "Validador de CPF",
                SwingConstants.CENTER
        );

        mensagem.setBounds(50, 50, 400, 30);
        janela.add(mensagem);

        // Torna a janela visível
        janela.setVisible(true);

        // Solicita o primeiro número
        String CPF = JOptionPane.showInputDialog(
                janela,
                "Digite seu CPF sem pontuação e espaço."
        );
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
            mensagem.setText("CPF valido"

            );
        }else{
            mensagem.setText("CPF invalido"

            );

        }






    }
}
