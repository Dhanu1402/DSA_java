import java.util.Scanner;

public class SumOfNumbersUntilZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("Enter a number : ");
            int n = sc.nextInt();
            if(n == 0){
                break;
            } else {
                sum += n;
                System.out.println(sum);
            };
        }
    }
}
