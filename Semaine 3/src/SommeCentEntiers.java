import java.util.Scanner;

public class SommeCentEntiers {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int somme = 0;

        for (int i = 1; i <= 100 ; i++) {
            System.out.print("Entrez l'entier n°"+i+" : ");
            int entier = scanner.nextInt();
            somme += entier;
        }//fin for
        System.out.println("La somme des 5 entiers est : "+somme);
    }
}