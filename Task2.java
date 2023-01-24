package Project;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Using Scanner create an array of countries.
        // When an array is created, retrieve all values from it and while retrieving those values print capital for each country.
        // (use 2 different loops).
        Scanner scanner = new Scanner(System.in);
        String[] countries = {"Austria", "Belgium", "Hungary", "Germany", "Kuwait"};
        String[] capitals = {"Vienna", "Brussels", "Budapest", "Berlin", "Kuwait City"};
        for (int i = 0; i < countries.length; i++) {
            System.out.println("The capital of " + countries[i] + " is " + capitals[i] + " ");
        }
        System.out.println("******************************************************************");

        Scanner sc = new Scanner(System.in);
        String[] countries1 = {"USA", "Canada", "UK", "Germany", "Japan"};
        String[] capitals1 = {"Washington", "Ottawa", "London", "Berlin", "Tokyo"};

        int i = 0;
        while (i < countries.length) {
            System.out.println("The capital of " + countries[i] + " is " + capitals[i]);
            i++;

        }
            }
        }










