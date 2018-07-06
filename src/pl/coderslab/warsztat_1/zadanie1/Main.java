package pl.coderslab.warsztat_1.zadanie1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        zgadnij();

    }

    static void zgadnij() {
        int liczba = 0;
        int lu = 0;

        Random r = new Random();
        liczba = r.nextInt(100) + 1;

        do {
            System.out.println("Zgadnij liczbę:");
            Scanner scan = new Scanner(System.in);


            try {
                lu = scan.nextInt();
                if ( lu < liczba) {
                    System.out.println("Za mało!");
                }
                if ( lu > liczba) {
                    System.out.println("Za dużo!");
                }


            } catch (InputMismatchException e) {
                System.out.println("To nie jest liczba.");
            }

        } while (liczba != lu );

        System.out.println("Zgadłeś");
    }
}
