package pl.coderslab.warsztat_1.zadanie3;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        zgadywanie();
    }

    static void zgadywanie () {
        System.out.println("Pomyśl liczbę od 0 do 1000" +
                "a ja ją zgadnę w 10 próbach");

        int guess = 0;
        int min = 0;
        int max = 1000;
        int i = 0;
        boolean w = false;
        String p = "";

        Scanner scan = new Scanner(System.in);

        do {
            guess = ((max - min) / 2) + min;
            System.out.println("Zgaduję " + guess);

            p = scan.next();
            if (p.equals("z")) {
                w = true;
                System.out.println("Wygrałem!");
            }
            if (p.equals("d")){
                max = guess;
            }
            if (p.equals("m")){
                min = guess;
            }
            if (!p.equals("m") && !p.equals("d") && !p.equals("z")){
                System.out.println("nie oszukuj!");
            }

            i++;
        } while ((i < 10) && (!w));

    }

}