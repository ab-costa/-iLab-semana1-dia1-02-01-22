import java.util.Scanner;

public class Uri1043 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        float a, b, c, perimetro, area;

        a = teclado.nextFloat();
        b = teclado.nextFloat();
        c = teclado.nextFloat();

        perimetro = a + b + c;
        area = ((a + b) * c) /2;

        if(a < b + c && b < a + c && c < a + b) {
            System.out.printf("Perimetro = %.1f\n", perimetro);
        } else {
            System.out.printf("Area = %.1f\n", area);
        }

        teclado.close();
    }
}