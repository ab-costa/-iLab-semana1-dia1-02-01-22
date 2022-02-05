import java.util.Scanner;

public class Uri1037 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double n;
        String mensagem;
        
        n = teclado.nextDouble();

        if(n < 0 || n > 100) {
            mensagem = "Fora de intervalo";
        } else if(n > 75) {
            mensagem = "Intervalo (75, 100]";
        } else if(n > 50) {
            mensagem = "Intervalo (50, 75]";
        } else if(n > 25) {
            mensagem = "Intervalo (25, 50]";
        } else {
            mensagem = "Intervalo [0, 25]";
        }

        System.out.println(mensagem);

        teclado.close();
    }
}