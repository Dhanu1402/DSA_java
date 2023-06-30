import java.util.Scanner;

public class RupeesToDollar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rupees : ");
        float rupee = sc.nextLong();
        float dollar = rupee / 90;
        System.out.println("Dollars : " + dollar);
    }
}
