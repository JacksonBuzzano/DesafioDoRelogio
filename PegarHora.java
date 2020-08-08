package desafiodelógica;

import java.util.GregorianCalendar;

public class PegarHora {

    //Obter o deslocamento do ponteiro da horaS
    private int pegarHora(int hora) {
        if (hora == 12) {
            hora = 00;
        }

        return (int) ((hora * 30));
    }

    //Obter o deslocamento do ponteiro do minuto
    private int pegarMinuto(int minuto) {
        if (minuto == 60) {
            minuto = 00;
        }
        return (int) minuto * 6;
    }

    //Obter o deslocamento do ponteiro da hora
    private int deslocamentoHora(int minuto) {
        if (minuto == 60) {
            minuto = 0;
        }
        return (int) (minuto * 30) / 60;
    }

    public long retornaAnguloRelogio(GregorianCalendar horario) {

        int ponteiroHora = pegarHora(horario.getTime().getHours());
        int ponteiroMinuto = pegarMinuto(horario.getTime().getMinutes());
        int deslocamento = deslocamentoHora(horario.getTime().getMinutes());

        //Realizar o calculo para obter o Real valor do ângulo entre os ponteiros
        int angulo = (int) ((ponteiroMinuto - ponteiroHora));
        int anguloFinal = (int) (angulo - deslocamento);

        //Resulto real do ângulo
        return anguloFinal;
    }
}
