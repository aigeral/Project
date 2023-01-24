package Project;

public class task11 {
    public static void main(String[] args) {

        //Write a program to print out duplicate elements from an Array of Strings?
        String[] names = {"Aron", "Nikki", "Sam", "Medina", "Lara", "Sam"};

        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if ((names[i].equals(names[j])) && (i != j)) {
                    System.out.println("The duplicate name in the array is: " + names[j]);

                }
            }
        }
    }
}








