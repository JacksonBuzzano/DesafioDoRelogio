package desafiodelógica;

import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class DesafioDeLógica {

    public static void main(String[] args) {

        int hr;
        int mn;
        JOptionPane.showMessageDialog(null, "Digite uma hora entre 00:00 e 12:00");

        //Pegar a hora que o usuário digitar
        String hora = JOptionPane.showInputDialog("Favor digitar uma hora válida!");
        hr = Integer.parseInt(hora);

        //Pegar o minuto que o usuário digitar
        String minuto = JOptionPane.showInputDialog("Favor digitar um minuto válido!");
        mn = Integer.parseInt(minuto);

        //Condição pra verificar se a hora esta entre o intervalo solicitado
        if (hr < 0) {
            JOptionPane.showMessageDialog(null, "Hora MENOR que 00!");
            return;
        } else if (hr > 12) {
            JOptionPane.showMessageDialog(null, "Hora MAIOR que 12!");
            return;
        } else if (mn < 0) {
            JOptionPane.showMessageDialog(null, "Minuto MENOR que 00!");
            return;
        } else if (mn > 60) {
            JOptionPane.showMessageDialog(null, "Miuto MAIOR que 60!");
            return;
        }
        PegarHora horaAtual = new PegarHora();

        GregorianCalendar gc = new GregorianCalendar(2020, 7, 8, hr, mn);
        long anguloReal = horaAtual.retornaAnguloRelogio(gc);

        //Exibe o Resultado
        JOptionPane.showMessageDialog(null, "O Ângulo entre a hora informada: " + hr + ":" + mn+"H"
                + " é de " + anguloReal + "º");

    }

}
