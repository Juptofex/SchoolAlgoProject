import java.util.Scanner;

public class PetitsDessins {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choix;
        do {
            afficherMenu();
            System.out.print("\nEntrez votre choix : ");
            choix= scanner.nextInt();
            switch (choix){
                case 1: carre();
                        break;
                case 2:triangleV1();
                        break;
                case 3:triangleV2();
                        break;
                case 4:triangleV3();
                        break;
                case 5:pyramide();
                        break;
                case 6:losange();
                        break;
            }
        }while (choix>=1 && choix<=6);
    }
    private static void afficherMenu(){
        System.out.println("*********");
        System.out.println("Dessins : ");
        System.out.println("*********");
        System.out.println("1 -> carre");
        System.out.println("2 -> triangle v1");
        System.out.println("3 -> triangle v2");
        System.out.println("4 -> triangle v3");
        System.out.println("5 -> pyramide");
        System.out.println("6 -> losange");
        System.out.println("autre -> quitter");
    }
    private static void carre(){
        System.out.print("\nEntrez n : ");
        int n= scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print('X');
            }
            System.out.println();
        }
    }
    private static void triangleV1(){
        System.out.print("\nEntrez n : ");
        int n= scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
    private static void triangleV2(){
        System.out.print("\nEntrez n : ");
        int n= scanner.nextInt();
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
    private static void triangleV3(){
        System.out.print("\nEntrez n : ");
        int n= scanner.nextInt();
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
    private static void pyramide(){ //WORK IN PROGRESS
        System.out.print("\nEntrez n : ");
        int n= scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(' ');
            }
            for (int j = n-i; j < n; j++) {
                System.out.print('X');
            }
            for (int j = n-i+1; j < n; j++) {
                System.out.print('X');
            }
            System.out.println();
        }
    }
    private static void losange(){ //WORK IN PROGRESS
        System.out.print("\nEntrez n : ");
        int n= scanner.nextInt();
        for (int i = 1; i <= n/2; i++) {
            for (int j = i; j <= n/2; j++) {
                System.out.print('X');
            }
            for (int j = 0; j < 2; j++) {
                for (int k = n-i+1; k < n; k++) {
                    System.out.print(' ');
                }
            }
            for (int j = i; j <= n/2; j++) {
                System.out.print('X');
            }
            System.out.println();
        }
        for (int i = 1; i <= n/2; i++) {
            for (int j = n-i; j < n; j++) {
                System.out.print('X');
            }
            for (int j = 0; j < 2; j++) {
                for (int k = i+1; k <= n/2; k++) {
                    System.out.print(' ');
                }
            }
            for (int j = n-i; j < n; j++) {
                System.out.print('X');
            }
            System.out.println();
        }
    }
}

