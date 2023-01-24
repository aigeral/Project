package Project;

public class task9 {
    public static void main(String[] args) {
        // Maximum and minimum number in the array?



        int[] numbers = {33, 2, 23, 9, 5, 6, 11, 8, 5, 10};
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("The max number is: " + max);
        System.out.println("The min number is: " + min);



    }



    }

