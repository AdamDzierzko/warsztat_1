package pl.coderslab.warsztat_1.zadanie2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] liczby = pobieranie();
        int[] wylosowane = losowanie();
        int w = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (liczby[i] == wylosowane[j]) {
                    w++;
                }
            }
        }
        System.out.println("Trafiłeś:" + w);

    }

    static int[] pobieranie() {
        int i = 0;
        int[] liczby = new int[6];
        int n = 0;

        do {
            System.out.println("Podaj liczbę:");
            Scanner scan = new Scanner(System.in);

            try {
                n = scan.nextInt();
                //              System.out.println(n);
                boolean found = false;
                for (int j = 0; j < i; j++) {
                    if (n == liczby[j]) {
                        found = true;
                    }
                }
                if (!found) {
                    liczby[i] = n;
                    i++;
                }

            } catch (InputMismatchException e) {
                System.out.println("Niepoprawne dane");
            }
        } while (i < 6);
        return liczby;
    }


    static int[] losowanie() {
        int[] wylowane = new int[6];
        int lw = 0;
        int z = 0;

        Random r = new Random();

        do {
            lw = r.nextInt(49) + 1;
            boolean found = false;

            for (int j = 0; j < z; j++) {
                if (lw == wylowane[j]) {
                    found = true;
                }
            }
            if (!found) {
                wylowane[z] = lw;
                z++;
            }

        } while (z < 6);

        return wylowane;
    }
}