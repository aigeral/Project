package Project;

public class task5 {
    public static void main(String[] args) {

            // Create a 2D array of integers.
        // Develop a program which will calculate the sum of  even and odd numbers for that array.

        int[][] arr = {{20, 14, 1, 7, 0, 16, 13, 14, 56, 19},
                {0, 5, 11, 44, 10, 65, 14, 21, 34, 20}};

        int evenSum = 0;
        int oddSum = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    evenSum += arr[i][j];
                } else {
                    oddSum += arr[i][j];
                }
            }

        }
        System.out.println("Sum of even numbers " + evenSum);
        System.out.println("Sum of odd numbers " + oddSum);

    }}