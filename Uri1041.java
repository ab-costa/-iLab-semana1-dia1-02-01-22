import java.util.Scanner;

public class Uri1041 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        float x, y;
        String mensagem;

        x = teclado.nextFloat();
        y = teclado.nextFloat();

        mensagem = "";

        if(x == 0 && y == 0) {
            mensagem = "Origem";
        } else if( x > 0 && y > 0) {
            mensagem = "Q1";
        } else if(x < 0 && y > 0) {
            mensagem = "Q2";
        } else if(x < 0 && y < 0) {
            mensagem = "Q3";
        } else if (x > 0 && y < 0) {
            mensagem = "Q4";
        } else if(x == 0) {
            mensagem = "Eixo Y";
        } else if(y == 0) {
            mensagem = "Eixo X";
        }

        System.out.println(mensagem);

        teclado.close();
    }
}