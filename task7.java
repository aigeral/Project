package Project;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

            // Write a java program to check whether a given number is prime or not?
        Scanner input=new Scanner(System.in);
        System.out.println("please enter number to check if it is prime or not");
        int number=input.nextInt();
        int count=0;
        for (int i = 1; i <=number; i++) {
            if (number%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }





    }
            }

