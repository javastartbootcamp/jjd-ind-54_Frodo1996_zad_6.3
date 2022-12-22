package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę wierszy:");
        int row = sc.nextInt();
        System.out.println("Podaj liczbę kolumn:");
        int column = sc.nextInt();
        int[][] array = new int[row][column];

        if (row <= 100 && column <= 100) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = i * j;
                    System.out.printf("%5d|", array[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.println("Podano zbyt duży rozmiar tablicy.");
        }
    }
}
