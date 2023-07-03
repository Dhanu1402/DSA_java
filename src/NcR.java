import java.util.Scanner;

public class NcR {
    static int nCr(int n, int r){
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
    static int factorial(int n){
        if (n == 0)
            return 1;
        int result = 1;
        for(int i = 2; i <=n; i++){
            result *= i;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("Enter the value of r : ");
        int r = sc.nextInt();
        int result = nCr(n, r);
        System.out.println("The value of nCr is : " + result);

    }
}
