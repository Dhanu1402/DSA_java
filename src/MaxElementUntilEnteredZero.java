import java.sql.Array;
import java.util.Scanner;

public class MaxElementUntilEnteredZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        while(true){
            for (int i = 0; i <= arr.length; i++){
                System.out.println("Enter a number : ");
                arr[i] = sc.nextInt();
            }

//            System.out.println("Enter a number : ");
//            arr[i] = sc.nextInt();
//            if(arr[i] == 0){
//                break;
//            } else {
//                int max = arr[0];
//                for (i = 0; i < arr.length; i++){
//                    if(arr[i] > max) {
//                        max = arr[i];
//                    }
//                    System.out.println("Maximum element is : " + max);
//                }
//            }
        }

    }
}
