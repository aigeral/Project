package Project;

public class task10 {
    public static void main(String[] args) {

        //Write a java program to find the second largest number in the array?

        int [] numbers={12,67,8,5,98};
        int max1=numbers[0];
        int max2=numbers[0];

        for (int i=0;i< numbers.length;i++){
            if (numbers[i]>max1){
                max2=max1;
                max1=numbers[i];
            }else if (numbers[i]>max2){
                max2=numbers[i];
            }
        }System.out.println(max2);
    }



    }





