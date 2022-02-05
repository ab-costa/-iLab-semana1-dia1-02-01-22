import java.util.Scanner;
import java.lang.Math;

public class Uri1036 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double a, b, c, delta, r1, r2;
        
        a = teclado.nextDouble(); 
        b = teclado.nextDouble(); 
        c = teclado.nextDouble();

        delta = b * b - 4 * a * c;

        if(delta >= 0 & a != 0) {
            r1 = (-b + Math.sqrt(delta)) / (2 * a);
            r2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
        } else {
            System.out.println("Impossivel calcular");
        }

        teclado.close();
    }
}