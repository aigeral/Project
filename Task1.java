package Project;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Using Scanner create an array of integer values.
        // After the array is created, calculate the sum of all stored elements in that array.


        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the numbers");
        int arr=input.nextInt();

        int [] num={45,2,11,7,15};
        int sum=0;

        for(int i=0;i<num.length;i++){
            sum=sum+num[i];}
        System.out.println("The sum of all elements is array: "+sum);
    }
}
