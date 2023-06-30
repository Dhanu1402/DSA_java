import java.util.Scanner;

public class Fibonacci {
    static int fib(int num){
        if(num == 0)
            return 0;
        else if(num == 1)
            return 1;
        else
            return fib(num - 1) + fib(num - 2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no : ");
        int a = sc.nextInt();
        System.out.println("Fibonacci series is ");
        for(int i = 0; i < a; i++){
            System.out.print(" " + fib(i));
        }
        System.out.println("");
        System.out.println("Fibonacci element is " + fib(a));
    }
}
