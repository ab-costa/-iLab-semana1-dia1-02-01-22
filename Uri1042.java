import java.util.Scanner;

public class Uri1042 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int a, b, c, n1, n2, n3;

        n1 = 0;
        n2 = 0;
        n3 = 0;

        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();

        if(a > b && a > c) {
            n3 = a;
            if(b > c) {
                n2 = b;
                n1 = c;
            } else {
                n2 = c;
                n1 = b;
            }
        } else if(a > b && a < c) {
            n1 = b;
            n2 = a;
            n3 = c;
        } else if(a < b && a < c) {
            n1 = a;
            if(b > c) {
                n2 = c;
                n3 = b;
            } else {
                n2 = b;
                n3 = c;
            }
        } else if(a < b && a > c) {
            n1 = c;
            n2 = a;
            n3 = b;
        }

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        teclado.close();
    }
}