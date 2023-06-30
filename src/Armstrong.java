import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int a = sc.nextInt();
        int temp = a;
        int p = 0;

        while(a > 0){
            int rem = a % 10;
            p += (rem * rem * rem);
            a /= 10;
        }

        if(temp == p){
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
