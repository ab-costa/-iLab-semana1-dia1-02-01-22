import java.util.Scanner;

public class Uri1046 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int inicio, fim, duracao;

        inicio = teclado.nextInt();
        fim = teclado.nextInt();

        duracao = fim - inicio;

        if(duracao <= 0) {
            duracao += 24;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);

        teclado.close();
    }
}