import java.util.Scanner;

public class Uri1040 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        float n1, n2, n3, n4, media, notaExame, mediaFinal;

        n1 = teclado.nextFloat();
        n2 = teclado.nextFloat();
        n3 = teclado.nextFloat();
        n4 = teclado.nextFloat();

        media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10;

        System.out.printf("Media: %.1f\n", media);

        if(media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if(media >= 5) {
            System.out.println("Aluno em exame.");

            notaExame = teclado.nextFloat();

            mediaFinal = (media + notaExame) / 2;

            System.out.printf("Nota do exame: %.1f\n", notaExame);

            if(mediaFinal >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f\n", mediaFinal);

        } else {
            System.out.println("Aluno reprovado.");
        }

        teclado.close();
    }
}