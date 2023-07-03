import java.util.Scanner;

public class AverageOfN_Numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        System.out.println("Enter the count of elements : ");
        int count = sc.nextInt();
        double[] arr = new double[count];
        System.out.println("Enter the numbers : ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextDouble();
        }
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double avg = sum / count;
        System.out.println("Average of numbers is : " + avg);
    }
}
