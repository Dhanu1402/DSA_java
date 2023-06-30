import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no : ");
        int a = sc.nextInt();
        if(a % 2 == 0){
            System.out.println("No is even");
        } else {
            System.out.println("No is odd");
        }
    }
}