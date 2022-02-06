import java.util.Scanner;

public class Uri1045 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double a, b, c, n1, n2, n3, a2, b2c2;

        n1 = 0;
        n2 = 0;
        n3 = 0;

        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        if(a >= b && a >= c) {
            n3 = a;
            if(b >= c) {
                n2 = b;
                n1 = c;
            } else {
                n2 = c;
                n1 = b;
            }
        } else if(a >= b && a <= c) {
            n1 = b;
            n2 = a;
            n3 = c;
        } else if(a <= b && a <= c) {
            n1 = a;
            if(b >= c) {
                n2 = c;
                n3 = b;
            } else {
                n2 = b;
                n3 = c;
            }
        } else if(a <= b && a >= c) {
            n1 = c;
            n2 = a;
            n3 = b;
        }

        a = n3;
        b = n2;
        c = n1;

        a2 = a * a;
        b2c2 = b * b + c * c;

        if(a > b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if(a2 == b2c2) {
            System.out.println("TRIANGULO RETANGULO");
        } else if(a2 > b2c2) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if(a2 < b2c2) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
        
        if(a == b && a == c && b ==c) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if( a == b || a == c || b == c) {
            System.out.println("TRIANGULO ISOSCELES");
        }

        teclado.close();
    }
}