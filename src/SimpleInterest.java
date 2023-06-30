import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount : ");
        int a = sc.nextInt();
        System.out.println("Enter rate : ");
        int b = sc.nextInt();
        System.out.println("Enter time : ");
        int c = sc.nextInt();
        int si = (a * b * c) / 100;
        System.out.println("Simple Intrest is : " + si);
    }
}
