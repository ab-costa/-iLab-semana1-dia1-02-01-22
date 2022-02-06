import java.util.Scanner;

public class Uri1048 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        float salario, reajuste;
        int percentual;

        percentual = 0;
        reajuste = 0;

        salario = teclado.nextFloat();

        if(salario > 2000) {
            percentual = 4;
            reajuste = (salario * percentual) / 100;
            salario += reajuste;
        } else if(salario > 1200) {
            percentual = 7;
            reajuste = (salario * percentual) / 100;
            salario += reajuste;
        } else if(salario > 800) {
            percentual = 10;
            reajuste = (salario * percentual) / 100;
            salario += reajuste;
        } else if(salario > 400) {
            percentual = 12;
            reajuste = (salario * percentual) / 100;
            salario += reajuste;
        } else if(salario >= 0) {
            percentual = 15;
            reajuste = (salario * percentual) / 100;
            salario += reajuste;
        }

        System.out.printf("Novo salario: %.2f\n", salario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.println("Em percentual: " + percentual + " %");

        teclado.close();
    }
}