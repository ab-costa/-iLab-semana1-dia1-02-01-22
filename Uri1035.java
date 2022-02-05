import java.util.Scanner;

public class Uri1035 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int a, b, c, d;
        boolean condicao;
        String mensagem;

        a = teclado.nextInt(); 
        b = teclado.nextInt(); 
        c = teclado.nextInt(); 
        d = teclado.nextInt();

        condicao = b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0;

        mensagem = condicao ? "Valores aceitos" : "Valores nao aceitos";

        System.out.println(mensagem);

        teclado.close();
    }
}