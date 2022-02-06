import java.util.Scanner;

public class Uri1049 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        String p1, p2, p3, animal;

        animal = "";

        p1 = teclado.nextLine();
        p2 = teclado.nextLine();
        p3 = teclado.nextLine();

        if(p1.equals("vertebrado") && p2.equals("ave") && p3.equals("carnivoro")) {
            animal = "aguia";
        } else if(p1.equals("vertebrado") && p2.equals("ave") && p3.equals("onivoro")) {
            animal = "pomba";
        } else if(p1.equals("vertebrado") && p2.equals("mamifero") && p3.equals("onivoro")) {
            animal = "homem";
        } else if(p1.equals("vertebrado") && p2.equals("mamifero") && p3.equals("herbivoro")) {
            animal = "vaca";
        } else if(p1.equals("invertebrado") && p2.equals("inseto") && p3.equals("hematofago")) {
            animal = "pulga";
        } else if(p1.equals("invertebrado") && p2.equals("inseto") && p3.equals("herbivoro")) {
            animal = "lagarta";
        } else if(p1.equals("invertebrado") && p2.equals("anelideo") && p3.equals("hematofago")) {
            animal = "sanguessuga";
        } else if(p1.equals("invertebrado") && p2.equals("anelideo") && p3.equals("onivoro")) {
            animal = "minhoca";
        }

        System.out.println(animal);

        teclado.close();
    }
}