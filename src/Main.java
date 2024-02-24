import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int k;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number greater than zero: ");
        k = input.nextInt();

        int sum = 0 ;
        int count = 0;


        for (int i = 0; i<=k ; i++){
            if (i % 12==0){
                System.out.println(i);
                sum += i;
                count ++;
            }
        }
        if ( count > 0){
            double average = (double) sum / count;
            System.out.println("Average of divisible by 12: " + average);
        }


    }
}