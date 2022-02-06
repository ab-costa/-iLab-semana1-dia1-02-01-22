import java.util.Scanner;

public class Uri1051 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double renda, imposto;

        imposto = 0;

        renda = teclado.nextFloat();

        if(renda > 4500) {
            imposto = 350 + (renda - 4500) * 0.28;
            System.out.printf("R$ %.2f\n", imposto);
        } else if(renda > 3000) {
            imposto = 80 + (renda - 3000) * 0.18;
            System.out.printf("R$ %.2f\n", imposto);
        } else if(renda > 2000) {
            imposto = (renda - 2000) * 0.08;
            System.out.printf("R$ %.2f\n", imposto);
        } else if(renda >= 0) {
            System.out.println("Isento");
        }

        teclado.close();
    }
}