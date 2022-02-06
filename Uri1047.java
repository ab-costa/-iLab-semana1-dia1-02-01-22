import java.util.Scanner;

public class Uri1047 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int hInicio, hFim, mInicio, mFim, duracao, horas, minutos;

        hInicio = teclado.nextInt();
        mInicio = teclado.nextInt();
        hFim = teclado.nextInt();
        mFim = teclado.nextInt();

        duracao = (hFim * 60 + mFim) - (hInicio * 60 + mInicio);

        if(duracao <= 0) {
            duracao += 24 * 60;
        }

        horas = duracao / 60;
        minutos = duracao % 60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);

        teclado.close();
    }
}