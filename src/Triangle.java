import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Basamak sayısını girin: ");
        int input = scn.nextInt();
        for (int i = 0; i <= input ; i++) {
            for (int j = 0; j < (input - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i = input - 1; i >= 0 ; i--) {
            for (int j = 0; j < (input - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
            }
        }
