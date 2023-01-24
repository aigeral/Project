package Project;

public class task3 {
    public static void main(String[] args) {
        int[][] numbers={{34,0,3},
                {9,15,6},
                {51,3,9}};
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum+=numbers[i][j];
            }


        }    System.out.print("The sum of all numbers is "+sum+" ");
    }

    public static class task {
        public static void main(String[] args) {
            String[][] countries={ {"USA", "Canada", "Mexico"},
                    {"Brazil", "Argentina", "Peru", "Colombia", "Chile"},
                    {"Germany","United","Kingdom","France","Spain"},
                    {"China","India","Japan","Russia"},
                    {"Egypt","Nigeria","South Africa","Ethiopia"}
            };

            System.out.println(countries[3].length);

            int counter=0;
            // using normal for loop
            for (int i = 0; i < countries.length; i++) {
                for (int j = 0; j < countries[i].length; j++) {
                    System.out.print(countries[i][j]+" ");
                    counter++;
                }
                System.out.println();
            }
            // Using enhanced for loop
            for (String[] country : countries) {
                for (String s : country) {
                    System.out.print(s + " ");
                    counter++;
                }
                System.out.println();
            }

            System.out.println("Total countries "+counter);
        }










    }
}


