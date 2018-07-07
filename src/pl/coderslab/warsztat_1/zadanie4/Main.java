package pl.coderslab.warsztat_1.zadanie4;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(kostka());
    }


    static int kostka() {
        int a, b, c, d;

        Random r = new Random();

        System.out.println("Podaj kostkę:");

        Scanner scan = new Scanner(System.in);
        String kostka = scan.nextLine();
        boolean plus = false;

        String[] po = kostka.split("D");
        if (po[0].equals("")) {

            String[] e = kostka.split("D|\\+|\\-");
            System.out.println(e[0]);

            if (e.length == 2) {

                b = Integer.parseInt(e[1]);
                d = r.nextInt(b) + 1;

                return d;
            } else {

                String[] poo = new String[3];
                poo[2] = "0";

                poo = kostka.split("D|\\+|\\-");

                if (kostka.contains("+")) {
                    plus = true;
                }

                a = Integer.parseInt(poo[1]);
                b = Integer.parseInt(poo[2]);
                a = r.nextInt(a) + 1;

                if (plus) {
                    d = a + b;
                } else {
                    d = a - b;
                }
                return d;
            }
        } else {

            String[] ko = {"1", "1", "0"};

            ko = kostka.split("D|\\+|\\-");

            if (kostka.contains("+")) {
                plus = true;
            }

            a = Integer.parseInt(ko[0]);
            b = Integer.parseInt(ko[1]);
            c = Integer.parseInt(ko[2]);
            b = r.nextInt(b) + 1;

            if (plus) {
                d = a * b + c;
            } else {
                d = a * b - c;
            }
            return d;
        }
    }
}
